package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autofillers {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("txtSource")).sendKeys("H");
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='Search']/div[1]/div[1]/ul/li"));
		System.out.println(auto.size());
		for (int i = 0; i < auto.size(); i++)
		{
			String city=auto.get(i).getText();
			System.out.println(city);
			if (city.equalsIgnoreCase("hyderabad")) 
			{
				auto.get(i).click();
				break;
				
			}
			
		}

	}

}
