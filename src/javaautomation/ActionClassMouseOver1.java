package javaautomation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActionClassMouseOver1 {

	public static void main(String[] args) throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//Dimension d= new Dimension(500,1000);
		//driver.manage().window().setSize(d);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
        Select mon= new Select(month);
        Thread.sleep(1000);
       List<WebElement> opt = mon.getOptions();
       for(WebElement i:opt) {
    	   System.out.println(i.getText());
    	   
       }
       //mon.selectByIndex(1);
       mon.selectByValue("1");
       if(mon.isMultiple())
       {
    	   System.out.println("yes mitliple");
       }
       else
       {
    	   System.out.println("no");
       }
	}

}
