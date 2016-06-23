package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class methodseg1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		Sleeper.sleepTightInSeconds(5);
		//navigate()
		
		driver.navigate().to("http://seleniumhq.org");
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		driver.navigate().forward();

	}

}
