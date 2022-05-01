package javaframework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics 
{
  // Pre Conditions
	@BeforeSuite   //1
	public void setUp()
	{
		System.out.println("Beforesuit--------setUp system propterties");
	}
	 @BeforeTest
	  public void login() //2
	  {
		  System.out.println("Before Test-------Login Method");
	  }
	
		
	@BeforeClass //3
	public void launchBrowser() 
  {
	  System.out.println("BeforeClass-------lanuch chrome browser");
  }
  @BeforeMethod //4
  public void enterURL()
  {
	  System.out.println("BeforeMethod-------Enter URL");
  }
 

  //Test cases
  @Test
public void googleTitletest()
{
	System.out.println("TestCase--------google Title test");
}

  
  //post conditions
  @AfterMethod
public void logOut() 
{
	System.out.println("Method-----------Logout form App");
}
@AfterTest
public void deleteAllCookies()
{
	System.out.println("Test---------Close Browser");
}
@AfterSuite
public void generateTestReport()
{
	System.out.println("Suit------------Generate Test Report");
}
	
}
