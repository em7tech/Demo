package parallelTest;

import org.testng.annotations.Test;

public class TestInvocation extends BaseTest {
	@Test(invocationCount=3,threadPoolSize=3)
	public void executeTest() {
		
		dr=getDriver("chrome");
		dr.get("http://google.com");
		System.out.println(dr.getTitle());
		
		dr.close();
		dr.quit();
		
		
	}

}
