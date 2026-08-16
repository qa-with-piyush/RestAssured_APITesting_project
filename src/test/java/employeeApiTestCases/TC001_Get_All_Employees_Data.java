package employeeApiTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import employeeApiBase.TestBase;
import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_Employees_Data extends TestBase
{

	@BeforeClass
	void getAllEmployees() throws InterruptedException
	{
		logger.info(" ********Started TC001_GetAllEmployeesDetails********");
		
		
		response = httprequest.request(Method.GET);
		
	}
	
	@Test
	void checkResponseBody()
	{
		logger.info("--------- Checking Response Body --------");
		
		String responsebody= response.getBody().asString();
		logger.info("Responsebody = "+responsebody);
		Assert.assertNotNull(responsebody , "Response Body should not be NULL");
	}
	
	
	@Test
	void checkStatusCode()
	{
	    logger.info("-------------Checking status code-------");
	    
	    int statuscode = response.getStatusCode();
	    logger.info("Status code is : " + statuscode);
	    
	    Assert.assertEquals(statuscode, 200);
	}
	
	@Test
	void checkResponseTime()
	{
		logger.info("-------checking Response Time--------");
		long responsetime = response.getTime();
		logger.info("Response time is :" + responsetime );
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
		Assert.assertEquals(contenttype,"application/json; charset=utf-8");
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
	void teardown()
	{
		logger.info("****************Class completed****************");
	}
	
}
