package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

		WebElement ddown = driver.findElement(By.name("employees_c"));
		Select select = new Select(ddown);

		WebElement firstOption = select.getFirstSelectedOption();
		System.out.println(firstOption.getText());
		select.selectByValue("level1");
		Thread.sleep(2000);
		select.selectByVisibleText("51 – 100 employees");
		Thread.sleep(2000);
		select.selectByIndex(5);
		Thread.sleep(2000);

		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		driver.manage().window().maximize();
		WebElement ddown2 = driver.findElement(By.id("multi-select"));
		Select select2 = new Select(ddown2);
		select2.selectByValue("California");
		Thread.sleep(2000);
		select2.selectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> allItems = select2.getAllSelectedOptions();
		System.out.println(allItems.size());
		select2.deselectAll();
		Thread.sleep(2000);
		select2.selectByValue("California");
		Thread.sleep(2000);
		select2.selectByIndex(5);
		Thread.sleep(2000);
		select2.deselectByIndex(5);
		Thread.sleep(2000);
		List<WebElement> allItems1 = select2.getAllSelectedOptions();
		System.out.println(allItems1.size());
		driver.quit();

	}

}
