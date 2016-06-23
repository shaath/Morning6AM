package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class orgmastertestng 
{
	public static WebDriver driver;
	public static String url="http://opensource.demo.orangehrm.com";
	public static String expval,actval;
	public static String  u="Admin",p="admin";
	public static String f="Sandeep123",l="G";
	public static String ename= f+" "+l,uname="Sandeep1234567",pwd="Sandeep12345",cpwd="Sandeep12345";
	@BeforeSuite
	public void org_Launch()
	{
		expval="btnLogin";
//		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	@AfterSuite
	public void org_Close()
	{
		driver.close();
	}
	
	
	@BeforeTest
	public void org_Login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval,"Login Failed");
		
	}
	
	@AfterTest
	public void org_Logout()
	{
		expval="btnLogin";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath(".//*[@id='welcome-menu']/ul/li[2]/a")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("id");
		
		Assert.assertEquals(actval, expval,"Launch Failed");
	}

}
