package javaautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTripd {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		WebElement sendname = driver.findElement(By.xpath("//input[@type='text']"));
		sendname.click();
		sendname.sendKeys("ch");
		Thread.sleep(3000);
		String name="Chandigarh";
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='sc-jvEmr ldCWqB']/li"));
		for(WebElement i:list) 
		{
			String mymatch=i.getText();
			if(mymatch.equals(name))
			{
			i.click();
			break;
			}
		}
	}

}
