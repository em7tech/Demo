package extent;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TstCase  {
	
	@Test
	public void doLogin() {

	
		System.out.println("Execute Log test");

	}

	@Test
	public void userRegis() {


		Assert.fail("Reg not good");

	}

	@Test
	public void isSkip() {

		throw new SkipException("Skipping the test case");

	}

}
