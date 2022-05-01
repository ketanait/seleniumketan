package javaautomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension (500,667));
		driver.get("http://automationpractice.com/index.php");
		TakesScreenshot tss= (TakesScreenshot) driver;
		File source=tss.getScreenshotAs(OutputType.FILE);
	
		File target= new File("D:\\ketan dhumal\\New folder\\JavaSelenium\\Screenshots\\ketan.jpg");
        FileHandler.copy(source, target);  
	}

}
