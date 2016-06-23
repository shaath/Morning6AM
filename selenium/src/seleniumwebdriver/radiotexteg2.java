package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class radiotexteg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		List<WebElement> group1=block.findElements(By.name("group1"));
		for (int i = 0; i < group1.size(); i++)
		{
			String radiotext=group1.get(i).getAttribute("value");
			System.out.println(radiotext);
			if (radiotext.equalsIgnoreCase("milk")) 
			{
				group1.get(i).click();
				break;
			}
			
		}
		Sleeper.sleepTightInSeconds(5);
		block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> group2=block.findElements(By.name("group2"));
		for (int i = 0; i < group2.size(); i++)
		{
			String radiotext=group2.get(i).getAttribute("value");
			System.out.println(radiotext);
			if (radiotext.equalsIgnoreCase("beer")) 
			{
				group2.get(i).click();
				break;
			}
			
		}

	}

}
