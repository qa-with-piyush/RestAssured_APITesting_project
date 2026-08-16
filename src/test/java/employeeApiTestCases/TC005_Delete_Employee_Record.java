package employeeApiTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import employeeApiBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;

public class TC005_Delete_Employee_Record extends TestBase
{
	int empId;

	@BeforeClass
	void deleteEmployeeRecord()
	{
		logger.info("**********TC005_Delete_Employee_Record Started**********");
		
		String token = System.getenv("API_TOKEN");
		httprequest.header("Authorization", "Bearer "+ token);
		
		response = httprequest.request(Method.GET);
		
	    // Extract first user's ID
		JsonPath jsonEvaluater = response.jsonPath();
		empId = jsonEvaluater.get("[0].id");
		
		response = httprequest.request(Method.DELETE,"/"+empId);

	}
	
	@Test
	void checkResponseBody()
	{
		logger.info("----------Cheking Response Body-------------");
		String responsebody = response.getBody().asString();
		logger.info("Employee Deleted : " + empId + responsebody);
	}
	
	@Test
	void checkStatusCode()
	{
	    logger.info("-------Cheking Status Code---------");
	    
	    int statuscode = response.getStatusCode();
	    logger.info("Status code = " + statuscode);
	    
	    Assert.assertEquals(statuscode, 204);
	}
	
	@Test
	void checkResponseTime()
	{
		logger.info("---------checking response time----------");
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
		logger.info("-----------Checking Content Type-------");
		String contenttype = response.header("Content-Type");
		logger.info("Content type = " + contenttype);

	}
	
	@Test()
	void checkServerType()
	{
		logger.info("--------cheking Server Type-----------");
		String servertype = response.header("Server");
		logger.info("Server type = "+ servertype);
	}
	
	@Test
	void checkContentEncoding()
	{
		logger.info("------------cheking content encoding--------");
		String contentencoding = response.header("Content-Encoding");
		logger.info("content encoding = " + contentencoding);
	}
	
	
	@AfterClass
	void tearDown()
	{
		logger.info("******** Class completed the all tests********");
	}
	
}
