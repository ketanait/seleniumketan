package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaFacebook 
{

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("ketan");
	//driver.findElement(By.xpath("//input[@id='pass' and @name='pass']")).sendKeys("yug");
	//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
    driver.findElement(By.xpath("//input[contains(@id,'pa')]")).sendKeys("yug");
    
	
	}

}
