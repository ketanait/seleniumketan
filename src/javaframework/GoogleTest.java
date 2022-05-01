package javaframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest 
{
WebDriver driver;
@BeforeMethod
public void setUp() throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(2000);
	
	
}
@Test
public void googleTitleTest()
{
	String title=driver.getTitle();
	System.out.println(title);
}
@Test
public void googleLogoTest()
{
	boolean b = driver.findElement(By.xpath("//img[@class='lnXdpd']")).isDisplayed();
	System.out.println(b);
}


@AfterMethod
public void tearDown()
{
	driver.quit();
}


}
