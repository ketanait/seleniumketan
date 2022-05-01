package javaautomation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePickerDemo1 {

	private static final String TakeScreenShot = null;
	private static final OutputType OutPuttype = null;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.name("checkin")).click();
	String month="March 2025";
	String year="2025";
	
	driver.manage().window().maximize();
		while(true)
		{
			
			String match=driver.findElement(By.xpath("//th[@colspan='5']")).getText();
			
		
			
			if (match.equalsIgnoreCase(month))
			{
				break;
			}
			else
				driver.findElement(By.xpath("//th[@class='next']")).click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='datepicker-days']/table/tbody/tr)[5]/td[3]")).click();
        TakesScreenshot st= (TakesScreenshot) driver;
        File source=st.getScreenshotAs(OutputType.FILE);
        File target= new File("D:\\ketan dhumal\\New folder\\JavaSelenium\\Snaps\\ketan.jpg");
        FileHandler.copy(source, target);
	}
	

}
