package Testngmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class AlwaysRun {
	WebDriver driver;
	
	@BeforeSuite(alwaysRun = true)
	public void setupSuite() {
	WebDriver driver = new FirefoxDriver();
	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
	driver.close();
	}
	
}
 