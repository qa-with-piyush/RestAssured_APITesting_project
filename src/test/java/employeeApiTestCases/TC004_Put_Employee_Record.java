package employeeApiTestCases;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import employeeApiBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import employeeApiUtilities.RandomEmployeeGenerateUtils;

public class TC004_Put_Employee_Record extends TestBase
{
	@BeforeClass
	void putEmployeeRecords()
	{
		logger.info("********TC004_Put_Employee_Record Started**********");
		
		response = httprequest.request(Method.GET);
		JsonPath jsonpathevaluater = response.jsonPath();
		int empId =jsonpathevaluater.get("[0].id");
		
		JSONObject requestparams = new JSONObject();
		requestparams.put("name", "updated_"+RandomEmployeeGenerateUtils.empName());
		requestparams.put("email", "updated_"+RandomEmployeeGenerateUtils.empEmail());
		requestparams.put("gender", "male");
		requestparams.put("status", "active");
		
		httprequest.header("Content-Type","application/Json");

		String token = System.getenv("API_TOKEN");
		httprequest.header("Authorization", "Bearer "+ token);
		
		httprequest.body(requestparams.toJSONString());
		
		response = httprequest.request(Method.PUT,"/"+empId);	
	}
	
	@Test
	void checkResponseBody()
	{
		logger.info("------------Check Response Body-----------");
		String responsebody = response.getBody().asString();
		logger.info("Response Body = "+ responsebody);
	}
	
	@Test
	void checkStatusCode()
	{
	    logger.info("---------Checking Status Code---------");
	    
	    int statuscode = response.getStatusCode();
	    logger.info("Status Code = " + statuscode);
	    
	    Assert.assertEquals(statuscode, 200);
	}
	
	@Test
	void checkResponseTime()
	{
		logger.info("---------checking Response Time----------");
		long responsetime = response.getTime();
		logger.info("Response time = " + responsetime);
		if(responsetime>2000)
		{
			logger.warn("Response time is greater than 2000");
		}
	}
	
	@Test
	void checkContentType()
	{
		logger.info("--------checking Content Type---------");
		String contenttype = response.header("Content-Type");
		logger.info("Content Type = "+ contenttype);
		Assert.assertEquals(contenttype,"application/json; charset=utf-8");

	}
	
	@Test
	void checkServerType()
	{
		logger.info("********checking Server Type********");
		String servertype = response.header("Server");
		logger.info("Server type = " + servertype);
	}
	
	@Test
	void checkContentEncoding()
	{
		logger.info("---------checking Content Encoding----------");
		String contentencoding = response.header("Content-Encoding");
		logger.info("Content Encoding = " + contentencoding);
	}
	
	@AfterClass
	void tearDown()
	{
		logger.info("************** Class completed the all tests ***************");
	}
}
