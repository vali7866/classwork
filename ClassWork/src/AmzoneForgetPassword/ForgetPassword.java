package AmzoneForgetPassword;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ForgetPassword {
	
	@Test
	public void main() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//Lunching Browser
		driver.get("https://www.amazon.in/ap/signin?_encoding=UTF8&openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_youraccount_nav_youraccount_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
		driver.findElement(By.id("ap_email")).click();
		//passing username
		driver.findElement(By.id("ap_email")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("//*[@id=\"auth-fpp-link-bottom\"]")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("continue")).click();
		String vali=driver.getCurrentUrl();
		System.out.println(vali);
		
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("meravali143");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("dollar@92");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		driver.findElement(By.xpath("//*[@id=\"gbqfq\"]")).sendKeys("account-update@amazon.in");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"gbqfb\"]/span")).click();
		driver.findElement(By.xpath("//*[@id=\":lw\"]")).click();
		Thread.sleep(20000);
		
        driver.get(vali);
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"a-autoid-0\"]/span/input")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ap_fpp_password\"]")).sendKeys("vali@7866");
        driver.findElement(By.xpath("//*[@id=\"ap_fpp_password_check\"]")).sendKeys("vali@786");
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		
		
		
		// sir how to add gmail and how to get passoword
		
		
	}
	 

}
