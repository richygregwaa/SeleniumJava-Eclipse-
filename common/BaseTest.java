// How to capture screenshots for failed tests in TestNG
// Following classes are used together: ListenerDemoTest, BaseTest, testUtils, Listeners, testng4.xml

package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver = null;
	
	@BeforeSuite
	public void launchBrowser()
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}

	@AfterSuite
	public void closingBrowser()
	{
		driver.close();
	}

	
	
}
