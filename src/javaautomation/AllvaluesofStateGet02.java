package javaautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllvaluesofStateGet02 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mhtcet2022.mahacet.org/RegistrationModule/frmRegistrationDetails");
		WebElement State = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlPState']"));
		Select State1=new Select(State);
		List<WebElement> StateList = State1.getOptions();
				
		int count=0;
		int countt=0;
		for (WebElement i:StateList)
		{
		System.out.println( count++ + "   "+i.getText());
		}
		
		
		for(int m=1;m<=38;m++)
		{	
			Thread.sleep(10000);
			State1.selectByIndex(m);
			Thread.sleep(20000);
		 List<WebElement> District = driver.findElements(By.xpath("//select[@name='ctl00$rightContainer$ContentTable2$ddlPDistrict']/option"));
		Select District1=new Select((WebElement) District);
		Thread.sleep(50000);
		List<WebElement> DistrictList = District1.getOptions();
		for (WebElement i:DistrictList)
		{
		System.out.println(countt++ + " " +i.getText());
		}
			
		Thread.sleep(4000);

	     }
		Thread.sleep(2000);
	}
}
