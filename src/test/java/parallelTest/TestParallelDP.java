package parallelTest;

import java.util.Date;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestParallelDP {
	
	@Test(dataProvider="getData")
	public void doLogin(String b) throws InterruptedException {
		Date d = new Date();
		System.out.println("Browser Name " + b+ " --" + d);
		Thread.sleep(3000);
	}
	
	@DataProvider(parallel=true)
	public Object [][] getData(){
		
		Object [][] data = new Object[2][1];
		
		data[0][0]= "firefox";
		data[1][0]= "chrome";
		
		return data;
		
		
	}

}
