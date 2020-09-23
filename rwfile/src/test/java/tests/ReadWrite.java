package tests;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWrite {

	public static void main(String[] args) throws IOException {

		Properties properties = new Properties();
		FileInputStream inputstram = new FileInputStream("C:\\eclipse-workspace\\rwfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstram);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));

		FileOutputStream outputstram = new FileOutputStream("C:\\eclipse-workspace\\rwfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdate", "7686786");
		properties.store(outputstram, "This is customer data from TC2");
		
	}

}
