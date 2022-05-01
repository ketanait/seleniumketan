package javaautomation;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SnapShot {
	
	public static void cs(WebDriver driver,String file)
	{
		
	}

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension (500,667));
		driver.get("http://automationpractice.com/index.php");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
         for(int i=1;i<=5;i++) 
        {
	    String name = RandomString.make(5);
		File target= new File("D:\\ketan dhumal\\New folder\\JavaSelenium\\Screenshots\\"+name+".jpg");
		FileHandler.copy(source, target);
        }
	
	}

}
