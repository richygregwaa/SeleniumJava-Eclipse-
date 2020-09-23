package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoIframeAndAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[@id=\"accept-choices\"]")).click();
		Thread.sleep(2000);		
		//driver.switchTo().frame(1);
		//driver.switchTo().frame("iframeResult");
		WebElement frame1 = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);		
		driver.findElement(By.xpath("/html/body/button")).click();
		String alertText = driver.switchTo().alert().getText();
		System.out.println(alertText);
		//Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(2000);
		Alert alertonpage = driver.switchTo().alert();
		alertonpage.sendKeys("Richard G");
		alertonpage.accept();
		driver.switchTo().parentFrame();
		System.out.println(driver.getTitle());
		
	} 

}
