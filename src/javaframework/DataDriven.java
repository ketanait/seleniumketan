package javaframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import graphql.Assert;

public class DataDriven 
{
WebDriver driver;
@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@Test(dataProvider="LoginData")
public void loginTest(String user, String pwd, String exp) throws InterruptedException
{
	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
	WebElement txtEmail=driver.findElement(By.id("Email"));
	txtEmail.clear();
	Thread.sleep(2000);
	txtEmail.sendKeys(user);
	Thread.sleep(2000);
	WebElement txtPassword=driver.findElement(By.id("Password"));
	txtPassword.clear();
	txtPassword.sendKeys(pwd);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	String exp_title="Dashboard / nopCommerce administration";
	String act_title=driver.getTitle();
	
	if(exp.equals("valid"))
	{
		if (exp_title.equals(act_title))
		{
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	else if (exp.equals("invalid"))
	{
		if (exp_title.equals(act_title))
		{
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			Assert.assertTrue(false);
		}
		else {
			Assert.assertTrue(true);
		}
	}
	
	
	
	System.out.println("Title=Dashboard / nopCommerce administration"+driver.getTitle());
	Thread.sleep(3000);
	
}

@DataProvider(name="LoginData")
public String [][] getData()
{
	String loginData[][]= {
			                 {"admin@yourstore.com","admin","valid"},
			                 {"admisn@datat2","admisn","invalid"},
			                 {"admisn@datat3","admisn","invalid"},
			                 {"admisn@datat4","admisn","invalid"}
	                       };
	return loginData;
	}
	
@AfterClass
void tearDown()
{
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	

}
