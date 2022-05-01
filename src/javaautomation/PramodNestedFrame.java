package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PramodNestedFrame {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='singleframe']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hie");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear(); 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("iframe[@src='MultipleFrames.html']")));
		driver.switchTo().frame(driver.findElement(By.xpath("iframe[@src='SingleFrame.html']")));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ooooo");
	}

}
