package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class profiles {

	public static void main(String[] args) 
	{
		ProfilesIni p=new ProfilesIni();
		FirefoxProfile fp=p.getProfile("Manasa");
		
		WebDriver driver=new FirefoxDriver(fp);
		driver.get("Http://facebook.com");
	}

}
