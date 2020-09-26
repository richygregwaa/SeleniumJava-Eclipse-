//  Following classes are used together: ListenerDemoTest, BaseTest, testUtils, Listeners, testng4.xml
// Following classes are used together: Listeners, ReportsTest, testng6

package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - " + result.getName());
		System.out.println("Test case is starting");
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log("Status of execution is - " + result.getStatus());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed - Screenshot Captured");
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFaiedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}


}
