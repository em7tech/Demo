package parameterization;

import org.testng.annotations.Test;

public class TestDP {
	
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testLogin(String username, String password) {
		
		System.out.println(username + "--- " + password );
		
	}
	
	@Test(dataProviderClass=DataProviders.class,dataProvider="dp1")
	public void testRegis(String fname, String lname, String email) {
		
		System.out.println(fname + "--- " + lname + "--" + email );
		
	}

}
