package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linkseg3 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/intl/en/policies/privacy/");
		//method1
//		driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td/ul/li[1]/a")).click();

		//method2
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='maia-footer-local']/div/div/div/div[1]/ul"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			if (links.get(i).getText().equalsIgnoreCase("faq"))
			{
				links.get(i).click();
				break;
			}
			
		}
		
	}

}
