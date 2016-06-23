package seleniumwebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class radiobuttonseg1
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");
		Sleeper.sleepTightInSeconds(5);
		WebElement block=driver.findElement(By.xpath(".//*[@id='SearchForm']/nav"));
		
		List<WebElement> radios=block.findElements(By.tagName("label"));
		System.out.println(radios.size());
		for (int i = 0; i < radios.size(); i++) 
		{
			String radiotext=radios.get(i).getText();
			if (radiotext.equalsIgnoreCase("round trip"))
			{
				radios.get(i).click();
				break;
			}
			
		}

	}

}
