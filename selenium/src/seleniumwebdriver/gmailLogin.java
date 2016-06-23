package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class gmailLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		
		//textbox related ops
		//method findelement, locator id
		WebElement email=driver.findElement(By.id("Email"));
		
//		to enter text into the text box 
		email.sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(5);
//		to clear the text in the text box
//		email.clear();
//		to click on the text box
//		email.click();
		
//		click on the next button
		//name 
		driver.findElement(By.name("signIn")).click();
		Sleeper.sleepTightInSeconds(5);
		//to enter password in password text box 
		
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("123456789");
		
		driver.findElement(By.cssSelector("#signIn")).click();
		
	}

}
