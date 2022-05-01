package javaautomation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebDriverSwitchWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://intmarks.unipune.ac.in/");
		driver.findElement(By.xpath("//a[@id='new']")).click();
		Set<String> win = driver.getWindowHandles();
		System.out.println(win);
		Object[] winn = win.toArray();
		//String win1 = winn[0].toString();
		//String win2 = winn[1].toString();
		//System.out.println(winn[1]);
		driver.switchTo().window((String) winn[1]);
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("52201375337");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("72496961");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		//Actions act =new Actions(driver); 
		//WebElement intex = driver.findElement(By.xpath("//body[1]/form[1]/div[3]/div[1]/div[1]/div[1]/aside[1]/section[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"));
	    //WebElement markenty = driver.findElement(By.xpath("//a[contains(text(),'2. Marks Entry')]"));
	    //act.moveToElement(intex).click().build().perform();
	    //act.moveToElement(markenty).click().build().perform();
	}

}
