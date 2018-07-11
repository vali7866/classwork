package AmozeReg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Regpage {
	
	@Test
	public void main() throws Exception {
	
	System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");

	WebDriver driver = new FirefoxDriver();

	driver.manage().window().maximize();
	/*driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);*/
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
	
	
	driver.findElement(By.id("ap_customer_name")).sendKeys("vali");
	driver.findElement(By.id("ap_phone_number")).sendKeys("9885771699");
	driver.findElement(By.id("ap_email")).sendKeys("meravali@gmail.com");
	driver.findElement(By.id("ap_password")).sendKeys("vali@786");
	driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	Thread.sleep(40000);
	driver.findElement(By.id("auth-verify-button")).click();
	
	driver.navigate().to("https://www.amazon.in");
	
	driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]")).click();
	driver.findElement(By.id("ap_email")).sendKeys("meravali143@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("vali@786");
	driver.findElement(By.id("signInSubmit")).click();
	Thread.sleep(30000);
	WebElement el= driver.findElement(By.xpath("//input[@type='submit' and @class='a-button-input' and @id='checkout-button']"));
	Actions a=new Actions(driver);
	
	a.moveToElement(el).perform();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//*[@id=\"nav-item-signout-sa\"]/span")).click();
	
	
}

}
