//Following classes are used together: ListenerDemoTest, Retry, RetryListener, testng5.xml

package common;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 
public class Retry implements IRetryAnalyzer {
 
  private int retryCount = 0;
  private static final int maxRetryCount = 4;
 

  public boolean retry(ITestResult result) {
    if (retryCount < maxRetryCount) {
      retryCount++;
      return true;
    }
    return false;
  }
}
