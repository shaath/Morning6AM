package seleniumwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class multiplewindowhandle
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		while (it.hasNext())
		{
			String windowid=it.next();
			System.out.println(windowid);
			
			driver.switchTo().window(windowid);
			try 
			{
				driver.findElement(By.linkText("Terms of Service")).click();
			} 
			catch (Exception e) 
			{
				System.out.println(e.getMessage());
				System.out.println("Expected link not available in this page");
			}
			Sleeper.sleepTightInSeconds(5);
			System.out.println(driver.getTitle()+"-------"+driver.getCurrentUrl());
			
		}
		


	}

}
