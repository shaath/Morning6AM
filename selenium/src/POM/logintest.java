package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintest 
{
	@Test
	public void lt()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com");
		driver.manage().window().maximize();
		
		orgHrmHomepage ohm=PageFactory.initElements(driver, orgHrmHomepage.class);
		
		orgHrmAdminpage oha=PageFactory.initElements(driver, orgHrmAdminpage.class);
		
		ohm.login("Admin", "admin");
		
		
		oha.welcomeclick();
		oha.logoutclick();
		
		driver.close();
		
		
		
	}

}
