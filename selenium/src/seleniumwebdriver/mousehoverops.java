package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class mousehoverops 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		Sleeper.sleepTightInSeconds(10);
		WebElement cat=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		
		WebElement books=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[3]/span"));
		
		WebElement text=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[3]/div[1]/div/a[8]/span"));
		Actions act=new Actions(driver);
		
		act.moveToElement(cat).build().perform();
		Sleeper.sleepTightInSeconds(5);		
		act.moveToElement(books).build().perform();
		Sleeper.sleepTightInSeconds(5);
		act.moveToElement(text).build().perform();
		Sleeper.sleepTightInSeconds(5);
		act.doubleClick().build().perform();

	}

}
