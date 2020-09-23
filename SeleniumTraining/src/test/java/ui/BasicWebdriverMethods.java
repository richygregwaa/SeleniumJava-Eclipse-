package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

import java.util.List;
import java.util.Set;

public class BasicWebdriverMethods {

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

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);

		String title = driver.getTitle();
		System.out.println(title);

		String pagesource = driver.getPageSource();
		System.out.println(pagesource);

		// driver.navigate().to("http://google.com");
		// driver.close();

		WebElement we = driver.findElement(By.id("user-name"));
		we.sendKeys("standard_user");
		// driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		List<WebElement> webelements = driver.findElements(By.xpath("//div[@class=\'inventory_list\']/div"));
		System.out.println(webelements);

		driver.navigate().to("https://www.sugarcrm.com/");
		String windowhandle = driver.getWindowHandle();
		System.out.println(windowhandle);

		driver.findElement(By.xpath("//*[@id=\"main\"]/section[4]/div/div/div[1]/a")).click();
		Set<String> windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);

		driver.quit();
	}

}
