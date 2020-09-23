package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// This data is used by the class 'DataProviderDemoA.java'.
// Initially there were two DataProviders below but this exercise was to show that if required only one may need to be used.
// In this case the same single DataProvider is used but using If and Else it looks at which test is calling it and provides 
// the matching number of data parameters. Could also offer totally different data depending on the test calling it


public class DataProviderDemo {


	@DataProvider(name="createRG")
	
	public Object[][] dataSet1(Method m) 
	{
		
		Object[][] testdata = null;
		
		if(m.getName().equals("test"))
		{
			testdata = new Object[][]
			
			{ 
				{ "username", "password" }, 
				{ "usernamea", "passworda" }, 
				{ "usernameb", "passwordb" }, 
				{ "usernamec", "passwordc" } 
			};	
		}
			else if(m.getName().equals("test1"))
			{	
				testdata = new Object[][]					
					{ 
						{ "username", "password","third" }, 
						{ "usernamea", "passworda","third1" }, 
						{ "usernameb", "passwordb","third2" }, 
						{ "usernamec", "passwordc","third3" } 
					};	
			}

			else if(m.getName().equals("test2"))
			{	
				testdata = new Object[][]					
					{ 
						{ "username", "password","third","forth" }, 
						{ "usernamea", "passworda","third1","forth" }, 
						{ "usernameb", "passwordb","third2","forth" }, 
						{ "usernamec", "passwordc","third3","forth" } 
					};	
			}

		
		return testdata;
			
	
	}
}
