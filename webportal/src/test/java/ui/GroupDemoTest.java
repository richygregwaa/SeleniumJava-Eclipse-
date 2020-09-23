package ui;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import common.CommonDataSetup;

//In this exercise you can right-click here and select Run-AS, then Run Configurations, 
//click Groups and then Browse button. Here you'll be able to select a group of tests that
//come under "regression", "bvt" or "user-registration"

@Test(groups="user-registration")
public class GroupDemoTest extends CommonDataSetup{
	
	
	@Test(priority=1,groups="regression")
	public void aTest1()
	{
		System.out.println("test1");
		
	}
	
	
	@Test(priority=2,groups="regression")
	public void bTest2()
	{
		System.out.println("test2");	
		Assert.assertTrue(false);
	}

	@Test(priority=3,groups= {"regression","bvt"})
	public void bTest3()
	{
		System.out.println("test3");		
	}

	@Test(priority=4,groups= "bvt")
	public void bTest4()
	{
		System.out.println("test4");		
	}

	
}
