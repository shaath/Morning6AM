package seleniumwebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class webtablerecorddel {

	public static void main(String[] args)
	{
		boolean flag=false;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrm.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(i+" Row colums size is : "+cols.size());
			
//			System.out.println(cols.get(2).getText());
			
			if (cols.get(1).getText().equalsIgnoreCase("1010"))
			{
				cols.get(0).click();
				driver.findElement(By.id("btnDelete")).click();
				driver.findElement(By.id("dialogDeleteBtn")).click();
				break;
			}
		}
		
		Sleeper.sleepTightInSeconds(5);
		
		rows=driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		
		System.out.println(rows.size());
		
		for (int i = 0; i < rows.size(); i++)
		{
			List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
			System.out.println(i+" Row colums size is : "+cols.size());
			
//			System.out.println(cols.get(2).getText());
			
			if (cols.get(1).getText().equalsIgnoreCase("1010"))
			{
				flag=false;
				break;
			}
			else
			{
				flag=true;
			}
		}
		
		if (flag==true)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		
		

	}

}
