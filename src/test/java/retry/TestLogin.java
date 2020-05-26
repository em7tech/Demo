package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	
	@Test(priority=1)
	public void doLogin() {
		
		System.out.println("Login Test");
		
		
	}
	
	static int count =0;
	@Test(priority=2)
	public void registerUser() {
		
		count++;
		System.out.println(count);
		//Assert.fail("Failed ");
		
		Assert.assertEquals(count, 1);
		
	}

}
