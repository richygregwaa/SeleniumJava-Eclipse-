package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class Locators {

	public static String browser = "chrome"; // External configuration - eg, xls, csv

	public static WebDriver driver;
	
	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
//https://www.selenium.dev/documentation/en/getting_started_with_webdriver/locating_elements/
		//driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("Testing");
		//driver.findElement(By.className("form_input")).sendKeys("Testing");
		//driver.findElement(By.cssSelector("#user-name")).sendKeys("Testing");
		//driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("Testing");
		//driver.findElement(By.tagName("input")).sendKeys("Testing");

		//driver.get("https://www.selenium.dev/documentation/en/getting_started_with_webdriver/locating_elements/");
		//driver.findElement(By.linkText("Quick tour")).click();
		//driver.findElement(By.partialLinkText("Quick t")).click();
		
		
//Friendly Locators - above - below - toLeftOf - toRightOf - near
		driver.get("https://www.saucedemo.com/");		
		WebElement password = driver.findElement(By.id("password"));
		driver.findElement(withTagName("input").above(password)).sendKeys("Testing");
		driver.findElement(withTagName("input").below(password)).click();
		
		
		
		

	}

}
