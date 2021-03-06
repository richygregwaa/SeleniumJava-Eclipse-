package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a"));		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/div[2]/div[1]/div[1]/ul/li[3]/a")).click();
		
	} 

}
