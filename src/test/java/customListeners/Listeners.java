package customListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Pass screenShot " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
	
		Reporter.log("<a href=\"C:\\Users\\bsemr\\Desktop\\TECH 7\\ScreenShot\\Eclipse\\err.png\"target=\"_blank\">ScreenShot Link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"C:\\Users\\bsemr\\Desktop\\TECH 7\\ScreenShot\\Eclipse\\err.png\"target=\"_blank\"><img height 200 width=200 src=\"C:\\Users\\bsemr\\Desktop\\TECH 7\\ScreenShot\\Eclipse\\err.png\"></a>");
		System.out.println("Failure screenShot " + result.getName());
	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	public void onStart(ITestContext context) {
	
	}

	public void onFinish(ITestContext context) {
	
	}

}
