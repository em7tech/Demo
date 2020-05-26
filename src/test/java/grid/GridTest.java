package grid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {

	public WebDriver dr;
	public DesiredCapabilities cap = new DesiredCapabilities();

	@Parameters({ "browser" })
	@Test
	public void launcBrowser(String browser) throws MalformedURLException {

		if (browser.equals("chrome")) {

			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("chrome");

			ChromeOptions opt = new ChromeOptions();
			opt.merge(cap);

		} else if (browser.equals("firefox")) {

			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("firefox");

			FirefoxOptions opt = new FirefoxOptions();
			opt.merge(cap);

		} else if (browser.equals("edge")) {

			cap.setPlatform(Platform.ANY);
			cap.setBrowserName("edge");

			EdgeOptions opt = new EdgeOptions();
			opt.merge(cap);

		}
		
		dr = new RemoteWebDriver (new URL("http://localhost:4444/"),cap);
		
		dr.get("http://gmail.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Title From the browser: "+ browser+"   "+ dr.getTitle());
		//dr.findElement(By.name("identifier")).sendKeys("yru this way ");
		
		dr.quit();

	}
}
