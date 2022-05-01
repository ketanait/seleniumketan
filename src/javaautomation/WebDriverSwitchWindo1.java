package javaautomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSwitchWindo1 {

	public static void main(String[] args) throws InterruptedException 
{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://intmarks.unipune.ac.in/");
		String parnetwind = driver.getWindowHandle();
		System.out.println(parnetwind);
		driver.findElement(By.xpath("//a[@id='new']")).click();
		Set<String> s = driver.getWindowHandles();
		 for(String i:s)
		 {
			if (!i.equals(parnetwind))
			{
				driver.switchTo().window(i);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("52201375337");
				driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("72496961");
				driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				Thread.sleep(3000);
				Actions act =new Actions(driver); 
				WebElement intex = driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/aside[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
			    WebElement markenty = driver.findElement(By.xpath("//a[contains(text(),'2. Marks Entry')]"));
			    act.moveToElement(intex).click().build().perform();
			    act.moveToElement(markenty).click().build().perform();
			    WebElement roll = driver.findElement(By.xpath("//select[@id='ContentArea_ddlRoll']"));
			    Select r=new Select(roll);
			    r.selectByValue("6");
			    driver.findElement(By.xpath("//tbody/tr[12]/td[7]/a[1]/span[1]")).click();
			    driver.manage().window().maximize();
			    driver.findElement(By.xpath("//input[@id='ContentArea_btnShowStudents']")).click();
			    
			}
				
			
			
		
		}
}
		   
		   
	}


