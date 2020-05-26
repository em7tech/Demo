package testCases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {
	
	@Test
	public void TestSkip() {
		
		throw new SkipException("Force Skip ");
		
	}

}
