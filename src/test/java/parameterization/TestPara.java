package parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPara {
	
	@Test(dataProvider="getData")
	public void doLogin(String username,String password) {
		System.out.println(username + "-----" + password);
	}
	
	@DataProvider
	public Object [][]  getData() {
		
		Object [][] data = new Object [3][2];
		
		data[0][0] = "emgmail.com";
		data[0][1] = "hio23";
		
		data[1][0] = "nazgmail.com";
		data[1][1] = "pol09";
		
		data[2][0] = "hasangmail.com";
		data[2][1] = "juo78";
		
		
		return data;
		}

}
