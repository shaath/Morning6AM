package seleniumwebdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class multiplewindowhandleeg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Privacy")).click();
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		while (it.hasNext()) 
		{
			String windowid=it.next();
			System.out.println(windowid);
			driver.switchTo().window(windowid);
			try
			{
				driver.findElement(By.xpath("/html/body/div[2]/section/div/article/nav/section[2]/h2")).click();
				break;
			} 
			catch (Exception e)
			{
				System.out.println("That element not available in this page");
			}
		}

	}

}
