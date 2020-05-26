package regression;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
	
	@Test
	public void validateTitle() {
		
		System.out.println("Begining");
		
		String expected = "Yahoo.com";
		String actual = "Gmail.com";
		
		SoftAssert sa = new SoftAssert();   //To report multiple failure
		
		System.out.println("Validating Title");
		sa.assertEquals(actual, expected);
		
		//Assert.assertTrue(false, "Not found");
		
		System.out.println("Validating image");
		sa.assertEquals(true, false);
		
		System.out.println("Validaing presense ");
		sa.assertEquals(false, true);
		
		System.out.println("Ending");
		
		sa.assertAll();         // To report all the failure instead of showing passes 
		
		//Assert.fail("Failing the test ");
		
		System.out.println("Ending");
	}
	
	

}
