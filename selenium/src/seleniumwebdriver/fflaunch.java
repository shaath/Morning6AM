package seleniumwebdriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class fflaunch {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		
		//get()  to launch the applications
		
		driver.get("http://facebook.com");
		
	}

}
