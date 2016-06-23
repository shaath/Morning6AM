package seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class orglogin {

	public static void main(String[] args)
	{

		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("dmin");
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.linkText("Welcome Admin")).isDisplayed())
		{
			System.out.println("Pass");
			
		}
		else
		{
			
			System.out.println("fail");
		}
	}

}
