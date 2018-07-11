package TestNGbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGBascics {

	/*
	 * setup system property for chrome
	lanch the browser
	enter the URl
	google title test
	log out the app
 	close the browser
	delete all cockies
	
	 * 
	 */
	
	//pre conditions annotations---  starting with@before
	@BeforeSuite
	
	public void SetUp()
	{
		
		
		System.out.println("@BeforeSuite ----setup system property for chrome");
	}
	
	
	
	@BeforeClass
	
	public void lanchbrowser()
	{
		
		System.out.println("@BeforeClass----luanch the browser");
		
	}
	
	@BeforeMethod
	public void enterUrl()
	{
		
		System.out.println("@BeforeMethod----enter the URl");
	}
	//testcase starting with test
	@Test
	public void googletitletest()
	{
		System.out.println("@Test 1-----google title test");
	}

	
	@Test
	public void search()
	{
		System.out.println("@Test 2-----enter the search");
	}
	
	@Test
	public void meerasearchoption()
	{
		System.out.println("@Test 3-----search the meera on google");
	}
	
	//post conditions --starting  with after
	@AfterMethod
	public void logout() {
		
		System.out.println("@AfterMethod----log out the app");
	}

	@AfterTest
	public void deleteallcockies()
	{
		System.out.println("@AfterTest----delete all cockies");
	}

	@AfterClass
	public void closebrowser()
	

	{
		
		System.out.println("@AfterClass-----close the browser");
	}
	
	@AfterSuite
	public void generatereport()
	{
		System.out.println("@AfterSuite------generate report");
	}
}
