package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkboxops {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).clear();
		driver.findElement(By.id("Email")).sendKeys("sharathqedge449");;
		
		driver.findElement(By.id("next")).click();
		
		if (driver.findElement(By.id("PersistentCookie")).isSelected())
		{
			
			driver.findElement(By.id("PersistentCookie")).click();
		}
		else
		{
			System.out.println("Uncheck already done");
		}
		

	}

}
