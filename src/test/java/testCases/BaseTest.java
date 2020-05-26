package testCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	
	
	@BeforeSuite
	public void setUp() {
		
		System.out.println("Initialinzing all ");
		System.out.println("Change in gitHub");
	}
	@AfterSuite
	public void tearDown() {
		
		System.out.println("Qutting everyting");
	}

}
