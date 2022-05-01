package javaautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravelCity {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='tours-tab']")).click();
		WebElement ele = driver.findElement(By.xpath("//span[@class='select2-selection__rendered']"));
		ele.click();
		ele.sendKeys("pun");
		String name = driver.findElement(By.xpath("(//div[@class='autocomplete-results troll intro in']/div/div//strong)[2]")).getText();
		System.out.println(name);
		List<WebElement> city = driver.findElements(By.xpath("//div[@class='autocomplete-results troll intro in']/div/div//strong"));
		
		for(WebElement i:city) {
			String cityname=i.getText();
			System.out.println(cityname);
		}

	}

}
