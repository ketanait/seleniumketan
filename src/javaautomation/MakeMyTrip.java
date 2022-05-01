package javaautomation;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=  new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='wzrk-cancel']")).click();
		List<WebElement> citylist = driver.findElements(By.xpath("//ul[@class='sc-FQuPU eCIDPD']/li"));
		String mycity="Chandigarh";
		for(WebElement city:citylist)
		{
			String match=city.getText();
			if(mycity.equals(match))
			{
			city.click();
			break;
			}
			
		}
		TakesScreenshot st=(TakesScreenshot) driver;
		File source=st.getScreenshotAs(OutputType.FILE);
		File target=new File("D:\\ketan dhumal\\New folder\\JavaSelenium\\Snaps\\ketan2.jpg");
		FileHandler.copy(source, target);
	}

}
