
package ui;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandleAuthenticationDemo {

	public static String username = "admin"; //Read in from CSV or XLS
	public static String password = "admin"; //Read in from CSV or XLS

	
	public static void main(String[] args) {

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();		

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();		

//		WebDriverManager.edgedriver().setup();
//		WebDriver driver = new EdgeDriver();		

		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");

	} 

}
