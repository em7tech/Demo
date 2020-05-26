package testCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase3  extends BaseTest{
	
	@Test(priority = 1,groups = {"smoke","functional"})
	public void doUserReg() {

		System.out.println("Executing User Reg test");
		Assert.fail("Reigster not sucesfull");
	}
	
	@Test(priority = 2,dependsOnMethods= "doUserReg",groups = {"smoke","functional"})  //dependsOnMethods= {"doUserReg","thirdTest"}
	public void doLogin() {

		System.out.println("Executing login test");
	}
	
	@Test(priority = 3,dependsOnMethods= "doUserReg",alwaysRun=true,groups = {"smoke","functional"})  //Soft dependency means if it depended on other method it will run 
	public void thirdTest() {

		System.out.println("Executing third test");
	}
	
	@Test(priority = 4,groups="bvt")
	public void fourthTest() {

		System.out.println("Executing fourth test");
	}



	
}
