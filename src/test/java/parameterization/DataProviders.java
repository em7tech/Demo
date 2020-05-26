package parameterization;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviders {

	
	
	@DataProvider (name ="dp1")
	public static Object [] [] getData (Method m){
		
		Object [] [] data = null;
		
		if(m.getName().equals("testLogin")) {
		
		data = new Object [2][2];
		
		data[0][0] = "emran";
		data[0][1] = "tre789";
		
		data[1][0] = "nayem";
		data[1][1] = "shaid567";
		
		}else if(m.getName().equals("testRegis")) {
			
			data = new Object [2][3];
			
			data[0][0] = "emran";
			data[0][1] = "babus";
			data[0][2] = "tre789";
			
			data[1][0] = "nayem";
			data[1][1] = "kamrul";
			data[1][2] = "tre789";
		}
		return data;
	
	}
	
	/*@DataProvider (name ="dp2")
	public static Object [] [] getData2 (){
		
		data = new Object [2][3];
		
		data[0][0] = "emran";
		data[0][1] = "babus";
		data[0][2] = "tre789";
		
		data[1][0] = "nayem";
		data[1][1] = "kamrul";
		data[1][2] = "tre789";
		
		return data;
	
	}*/

}
