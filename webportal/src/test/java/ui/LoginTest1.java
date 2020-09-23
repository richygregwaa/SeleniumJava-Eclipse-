package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

//@Before and @After execure before and after the tests without being identified as tests themselves
// TestNG runs the tests alphabetically. So atest would get executed before btest even though it comes after btest.
// However this has been changed using priority=1 and priority=2. Now btest will come before atest.
// Description of the test (appears after priority=1,) will also appear in the console output


public class LoginTest1 extends CommonDataSetup{
	
	@BeforeTest
	public void loginToApplication()
	{
		System.out.println("Login to application");
	}

	@AfterTest
	public void logoutFromApplication()
	{
		System.out.println("Logout from application");
	}

	@BeforeMethod
	public void connectToDB()
	{
		System.out.println("DB Connected");
	}
	
	@AfterMethod
	public void disconnectFromDB()
	{
		System.out.println("Disconnect DB");
	}

	
	
	
	@Test(priority=1,description="This is a login test",groups="regression")
	public void bTest()
	{
		System.out.println("Login is successful");
		
	}
	
	@Test(priority=2,description="Test 2")
	public void aTest()
	{
		System.out.println("Logout is successful");		
	}
	
}
