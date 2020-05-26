package listenersOnFailure;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
	
	
	@Test(priority =1)
	public void doLogin() {
		
		dr.findElement(By.id("identifierId12")).sendKeys("myemail.com");
		dr.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
	}
	
	@Test(priority =2)
	public void composeEmail() {
		
		Assert.fail();
	}

}
