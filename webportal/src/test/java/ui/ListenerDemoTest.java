// How to capture screenshots for failed tests in TestNG
// Following classes are used together: ListenerDemoTest, BaseTest, testUtils, Listeners, testng4.xml

package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemoTest extends BaseTest{
	
	@Test
	public void launchApp()
	{
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}
	

}
