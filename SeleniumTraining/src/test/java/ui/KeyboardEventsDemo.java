package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class KeyboardEventsDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://extendsclass.com/text-compare.html");
		driver.manage().window().maximize();		

		WebElement sourcetextarea = driver.findElement(By.xpath("//*[@id=\"dropZone\"]//div[7]/pre/span"));
		Actions action = new Actions(driver);
		Thread.sleep(2000);
		action.keyDown(sourcetextarea, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		WebElement destinationarea = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]//div[5]/div[4]/pre/span"));
		Thread.sleep(2000);
		action.keyDown(destinationarea, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
	} 

}
