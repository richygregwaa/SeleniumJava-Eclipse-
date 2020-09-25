// How to capture screenshots for failed tests in TestNG
// Following classes are used together: ListenerDemoTest, BaseTest, testUtils, Listeners, testng4.xml
// Following classes are used together: ListenerDemoTest, Retry, RetryListener, testng5.xml

package ui;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ListenerDemoTest extends BaseTest {

//	@Test(retryAnalyzer = common.Retry.class)
//  ( * * The above '@Test' line is now set as a Listener in testng5.xml therefore parameters in brackets have been removed* *)	
	@Test

	public void launchApp() {
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}

}
