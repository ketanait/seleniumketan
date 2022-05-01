package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.findElement(By.name("checkin")).click();
	String month="March";
	String year="2025";
	driver.manage().window().maximize();
		while(true)
		{
			String match=driver.findElement(By.xpath("//th[@colspan='5']")).getText();
			String arr[]=match.split(" ");
			System.out.println(arr[0]);
			Thread.sleep(4000);
			String mon=arr[0];
			String yr=arr[1];
			Thread.sleep(2000);
			if (mon.equalsIgnoreCase(month) && yr.equals(year))
			{
				break;
			}
			else
				driver.findElement(By.xpath("//th[@class='next']")).click();
		}
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='datepicker-days']/table/tbody/tr)[5]/td[3]")).click();
	}

}
