package listenersOnFailure;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver dr;
	
	@BeforeSuite
	public void setUp() {
		
		if(dr==null) {
			WebDriverManager.chromedriver().setup();
			dr= new ChromeDriver();
			dr.get("http://gmail.com");
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
			
		}
	}		
		@AfterSuite
		public void tearDown() {
			
			dr.close();
			dr.quit();
		}
	

}
