package testCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase1 extends BaseTest{
	
	
	@BeforeTest // Execute only once before all the test cases 
	public void createDBconnection() {
		System.out.println("Creating DB connection");
	}
	@AfterTest
	public void closingDBconnection() {
		System.out.println("Closing  DB connection");
	}
	
	@BeforeMethod // Runs once before every test cases
	public void launchBrowser() {
		System.out.println("Launching Browser");
	}

	@Test(priority = 2,groups ="functional")
	public void doLogin() {

		System.out.println("Executing login test");
	}

	@Test(priority = 1,groups ="functional")
	public void doUserReg() {

		System.out.println("Executing User Reg test");
	}

	@AfterMethod
	public void closingBrowser() {
		System.out.println("Closing Browser");
	}

}
