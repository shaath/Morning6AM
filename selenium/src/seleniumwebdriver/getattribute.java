package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class getattribute {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		String text=driver.findElement(By.linkText("Images")).getText();
		System.out.println(text);
		
		String google=driver.findElement(By.name("btnK")).getAttribute("jsaction");
		System.out.println(google);
	}

}
