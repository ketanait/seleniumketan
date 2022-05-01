package javaautomation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllValuescofCast {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mhtcet2022.mahacet.org/RegistrationModule/frmRegistrationDetails");
	WebElement Gender = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlGender']"));
	Select gen= new Select (Gender);
	List<WebElement> listofGender = gen.getOptions();
	for(WebElement i:listofGender)
	{
		System.out.println(i.getText() );
	}
		WebElement Nation = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlNationality']"));

		Select Nlity=new Select(Nation);
		
		List<WebElement> allnation = Nlity.getOptions();
		
		for(WebElement i:allnation)
		{
			System.out.println(i.getText() );
			
		}
		WebElement Religion = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlReligion']"));		
		Select Religion1=new Select(Religion);
		List<WebElement> ReligionList = Religion1.getOptions();
		for(WebElement i:ReligionList)
		{
			System.out.println(i.getText());
		}
		WebElement Regiontowhichyoubelong = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlRegion']"));
		Select Regiontowhichyoubelong1=new Select(Regiontowhichyoubelong);
		List<WebElement> RegiontowhichyoubelongList = Regiontowhichyoubelong1.getOptions();
		for (WebElement i:RegiontowhichyoubelongList) {
			System.out.println(i.getText());
		}
		WebElement AnnualFamilyIncome = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlAnnualFamilyIncome']"));
		Select AnnualFamilyIncome1=new Select(AnnualFamilyIncome);
		List<WebElement> AnnualFamilyIncomeList = AnnualFamilyIncome1.getOptions();
		for(WebElement i:AnnualFamilyIncomeList)
		{
			System.out.println(i.getText());
		}
		WebElement MotherTongue = driver.findElement(By.xpath("//select[@id='rightContainer_ContentTable2_ddlMotherTongue']"));
		Select MotherTongue1=new Select(MotherTongue);
		List<WebElement> MotherTongueList = MotherTongue1.getOptions();
		
		for(WebElement i:MotherTongueList)
		{
			System.out.println(i.getText());
		}
	}


}

