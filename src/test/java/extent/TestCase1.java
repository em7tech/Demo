package extent;

import java.util.Arrays;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestCase1 {

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void setReport() {

		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setEncoding("utf-8");
		htmlReporter.config().setDocumentTitle("Em7Tech Reports");
		htmlReporter.config().setReportName("Test Results");
		htmlReporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		extent.setSystemInfo("Automation Tester", "Emran");
		extent.setSystemInfo("Orgainzation", "Em7Tech");
		extent.setSystemInfo("Build No", "Em7-432");

	}

	@AfterTest
	public void endReport() {

		extent.flush();
	}

	@Test
	public void doLogin() {

		test = extent.createTest("Login Test");
		System.out.println("Execute Log test");

	}

	@Test
	public void userRegis() {

		test = extent.createTest("User reg Test");
		Assert.fail("Reg not good");

	}

	@Test
	public void isSkip() {

		test = extent.createTest("Skip Test");
		throw new SkipException("Skipping the test case");

	}

	@AfterMethod
	public void tearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {

			String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			test.fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
					+ "</font>" + "</b >" + "</summary>" + excepionMessage.replaceAll(",", "<br>") + "</details>"
					+ " \n");
			
		/*	try {

				ExtentManager.captureScreenshot();
				testReport.get().fail("<b>" + "<font color=" + "red>" + "Screenshot of failure" + "</font>" + "</b>",
						MediaEntityBuilder.createScreenCaptureFromPath(ExtentManager.screenshotName)
								.build());
			} catch (IOException e) {*/
			
			String failureLogg = "TEST CASE FAILED";
			Markup m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);
			test.log(Status.FAIL, m);

		} else if (result.getStatus() == ITestResult.SKIP) {

			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "Test Case:  - " + methodName.toUpperCase() + "  Skipped  " + "</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.TEAL);
			test.skip(m);

		} else if (result.getStatus() == ITestResult.SUCCESS) {

			String methodName = result.getMethod().getMethodName();

			String logText = "<b>" + "Test Case:  - " + methodName.toUpperCase() + "  Passed  " + "</b>";

			Markup m = MarkupHelper.createLabel(logText, ExtentColor.LIME);
			test.pass(m);
		}
	}

}
