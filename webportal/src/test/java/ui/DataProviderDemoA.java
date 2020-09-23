package ui;

import org.testng.annotations.Test;

// This test uses data from the class 'DataProviderDemo.java.
//Each test is calling the same dataProvider with different number of parameters being passed.
// The dataProvider returns the matching number of parameters based on the test calling it.
// The external class details are added in the @Test brackets along with the dataProvider details.

public class DataProviderDemoA {

	
	@Test(dataProvider = "createRG",dataProviderClass=DataProviderDemo.class)
	public void test(String username, String password) 
	{
		System.out.println(username + "======" + password);
	}
	

	@Test(dataProvider = "createRG",dataProviderClass=DataProviderDemo.class)
	public void test1(String username, String password, String test) 
	{	
		System.out.println(username + "======" + password + "======" + test);
	}


	@Test(dataProvider = "createRG",dataProviderClass=DataProviderDemo.class)
	public void test2(String username, String password, String test, String test1) 
	
	{	
		System.out.println(username + "======" + password + "======" + test + "======" + test1);
	}

	
	
}
