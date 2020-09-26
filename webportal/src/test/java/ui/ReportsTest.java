// Following classes are used together: Listeners, ReportsTest, testng6

package ui;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportsTest {

	@Test
	public void reporterTest1()
	{
		System.out.println("This is test 1");
	}

	
	@Test
	public void reporterTest2()
	{
		Reporter.log("This is test 2");
		System.out.println("This is test 2");
	}


	@Test
	public void reporterTest3()
	{
		System.out.println("This is test 3");
	}

	
	@Test
	public void reporterTest4()
	{
		System.out.println("This is test 4");
	}


}
