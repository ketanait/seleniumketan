package javaautomation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablePrinting {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/List_of_states_and_union_territories_of_India_by_population");
		List<WebElement> heder = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/thead/tr/th"));
for(WebElement i:heder)
{
	System.out.print(i.getText()+"  | ");
}
System.out.println();
List<WebElement> table = driver.findElements(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr"));
	for(int i=1;i<=37;i++)
	{
		for(int j=1;j<=12;j++)
		{
			System.out.print(driver.findElement(By.xpath("//table[@class='wikitable sortable jquery-tablesorter']/tbody/tr["+i+"]/td["+j+"]")).getText()+" | ");
		}
		System.out.println();
	}
	
	}

}
