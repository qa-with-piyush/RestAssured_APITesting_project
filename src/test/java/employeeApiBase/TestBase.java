package employeeApiBase;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.testng.annotations.BeforeClass;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class TestBase 
{
	
	public static RequestSpecification httprequest ;
	public static Response response ;
		
	public Logger logger;
	
	
	@BeforeClass
	public void setup()
	{
		logger = LogManager.getLogger("EmployeesrRestAPI");
		
        RestAssured.baseURI="https://gorest.co.in/public/v2/users";	
		httprequest = RestAssured.given();
		
	}
}
