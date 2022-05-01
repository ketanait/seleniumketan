package javaautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mhtcet2022.mahacet.org/RegistrationModule/frmRegistrationDetails");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='rightContainer_ContentTable2_txtCandidateName']")).sendKeys("KETAN KALIDAS DHUMAL");
		driver.findElement(By.xpath("//input[@id='rightContainer_ContentTable2_txtFatherName']")).sendKeys("KALIDAS");
		driver.findElement(By.xpath("//input[@id='rightContainer_ContentTable2_txtMotherName']")).sendKeys("CHHYA");
		Thread.sleep(2000);
		WebElement gender=driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlGender']"));
		Select s =new Select(gender);                                                                           
		s.selectByValue("F");
		driver.switchTo().alert().accept();
	    WebElement cgender=driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlGenderre']"));
		Select ss =new Select(cgender); 
		Thread.sleep(2000);
		ss.selectByVisibleText("Female");
	
		}

}
