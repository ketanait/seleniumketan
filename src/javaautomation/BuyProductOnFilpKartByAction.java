package javaautomation;

import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BuyProductOnFilpKartByAction {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		String a="Fashion";
		String b="Men Footwear";
		String c="Men's Slippers & Flip Flops";
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='InyRMC _3Il5oO']/div/div/a/div[2]"));
		Actions all= new Actions (driver);
		for(  WebElement i:options)
			
	{
		String match = i.getText();
		all.moveToElement(i).build().perform();
		Thread.sleep(2000);
		if(a.equals(match))
		{
			Thread.sleep(2000);
			break;    
		}
		
	}
		Thread.sleep(3000);
		 List<WebElement> options1 = driver.findElements(By.xpath("//div[@class='_2IjXr8']/div/a"));
			for(WebElement k:options1)
			{
			   String match1=k.getText();
				Thread.sleep(2000);
			   all.moveToElement(k).build().perform();
			   if(b.equals(match1))
			   {
				  Thread.sleep(2000);
				   break;
			   }
				
			}
			Thread.sleep(2000);
			 List<WebElement> options2 = driver.findElements(By.xpath("//div[@class='_3XS_gI']/a"));
				for(WebElement x:options2)
				{
				   String match2=x.getText();
					Thread.sleep(2000);
				   all.moveToElement(x).build().perform();
				  
				  if(c.equals(match2))
				   {
					  all.click().build().perform();
					  System.out.println("Selected option Men's Slippers & Flip Flops");
					   break;
				   }
					
				}
			
	}


}
