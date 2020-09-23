package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class VerifyTitleAndTextTest {

	@Test
	public void titleTest()
	{
		//SoftAssert allows the script to continue whereas Assert will fail and stop script
		SoftAssert softassert = new SoftAssert();
		
		String expectedtitle = "RGElectronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext = "RGSearch";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		String actualtitle = driver.getTitle();
		System.out.println("Verifying Title");

		//Assert.assertEquals(actualtitle, expectedtitle,"Title verification failed");
		softassert.assertEquals(actualtitle, expectedtitle,"Title verification failed");

		String actualtext = driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
		System.out.println("Verifying Title");			

		//Assert.assertEquals(actualtext, expectedtext, "Text verification failed");
		softassert.assertEquals(actualtext, expectedtext, "Text verification failed");

		System.out.println("Closing Browser");
		driver.close();
		softassert.assertAll(); // Without this line the softasserts above won't be reported
	}
	
}
