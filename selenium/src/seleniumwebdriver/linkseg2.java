package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg2 {

	public static void main(String[] args) 
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			String linktext=links.get(i).getText();
			if (linktext.equalsIgnoreCase("rajinikanth")) 
			{
				flag=true;
				break;
			}
			
		}
		if (flag==true)
		{
			System.out.println("Rajinikanth link available in google page ");
			
		}
		else
		{
			System.out.println("Rajinikanth link not available in google page");
		}

	}

}
