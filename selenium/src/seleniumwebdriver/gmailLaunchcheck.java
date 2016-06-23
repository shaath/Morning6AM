package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailLaunchcheck {

	public static void main(String[] args) 
	{
		String exptitle="gmail";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		String acttitle=driver.getTitle();
		
		if (exptitle.equalsIgnoreCase(acttitle)) 
		{
			System.out.println("Gamil Launch Successfull");
		}
		else
		{
			System.out.println("Gmail Launch Failed");
		}
		
		

	}

}
