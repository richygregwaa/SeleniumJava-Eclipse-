package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PrintAllLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

		
		List<WebElement> allTags = driver.findElementsByTagName("a");
		System.out.println("Total tags are: " + allTags.size());
		
		for(int i=0;i<allTags.size();i++)
		{
			System.out.println("Links on page are: " + allTags.get(i).getAttribute("href"));
			System.out.println("Links on page are: " + allTags.get(i).getText());

		}
		
		

		driver.get("https://www.salesforce.com/uk/form/signup/freetrial-sales-pe/?d=70130000000EqoP");
		driver.manage().window().maximize();

		
		List<WebElement> allTags2 = driver.findElementsByTagName("option");
		System.out.println("Total option tags are: " + allTags2.size());
		
		for(int i=0;i<allTags2.size();i++)
		{
			System.out.println("Option value on page are: " + allTags2.get(i).getAttribute("value"));
			System.out.println("Option text on page are: " + allTags2.get(i).getText());

		}
		
		
		
	} 

}
