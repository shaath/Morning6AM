package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class grideg 
{
	@Test
	public void grid() throws MalformedURLException
	{
//		DesiredCapabilities cap=DesiredCapabilities.firefox();
//		
//		cap.setBrowserName("firefox");
//		cap.setPlatform(Platform.WINDOWS);
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.ANY);
		
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.32:4444/wd/hub"), cap);
		driver.get("http://google.com");
	}
}
