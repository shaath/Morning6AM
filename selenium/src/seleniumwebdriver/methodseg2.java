package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class methodseg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		WebDriver driver1=new FirefoxDriver();
		driver.get("http://hdfc.com");
		driver1.get("http://gmail.com");
		driver.manage().window().maximize();
		
		System.out.println("Title of the page is: "+ driver.getTitle());
		
		System.out.println("Url of the page is: "+ driver.getCurrentUrl());
		
		System.out.println("Title of the page is: "+ driver1.getTitle());
		
		System.out.println("Url of the page is: "+ driver1.getCurrentUrl());
		driver.close();
		
		driver1.quit();

	}

}
