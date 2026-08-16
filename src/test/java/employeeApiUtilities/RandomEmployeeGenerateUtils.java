package employeeApiUtilities;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomEmployeeGenerateUtils 
{

	public static String empName()
	{
		String generatedString = RandomStringUtils.secure().nextAlphabetic(1);
		return ("Piyush" + generatedString);
	}
	
	public static String empEmail()
	{
		String generatedString = RandomStringUtils.secure().nextAlphanumeric(5);
		return (generatedString + "@gmail.com");
	}
	
	
}
