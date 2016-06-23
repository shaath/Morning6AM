package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class linkseg4 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		List<WebElement> links=block.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Sleeper.sleepTightInSeconds(5);

			System.out.println(driver.getTitle()+"---------"+driver.getCurrentUrl());
			driver.navigate().back();
			Sleeper.sleepTightInSeconds(5);
			block=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			links=block.findElements(By.tagName("a"));
		}

	}

}
