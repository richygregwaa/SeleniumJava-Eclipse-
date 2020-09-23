package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ResizeDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		
		WebElement visual = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/ul/li[10]/a"));

		
		Actions action = new Actions(driver);				
		action.moveToElement(visual).perform();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));		
		driver.switchTo().frame(frame);
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));

		action.dragAndDropBy(element, 300, 10).perform();
		
		
	} 

}
