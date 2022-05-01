package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class GuruBank {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr396269");
		driver.findElement(By.name("password")).sendKeys("Azynytu");
		driver.findElement(By.name("btnLogin")).click();
		System.out.println(driver.getTitle());
		

		
		
	}

}
