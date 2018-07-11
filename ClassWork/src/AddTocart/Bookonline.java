package AddTocart;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Bookonline {

	@Test
	public void main() throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		driver.navigate().to("https://www.amazon.in");
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("vali@786");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Steve Jobs");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		/*Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"sort\"]")));
		sel.selectByValue("price-asc-rank");
		Thread.sleep(8000);
		

		driver.findElement(By.xpath("//*[@id=\"leftNavContainer\"]/ul[12]/div/li[4]/span/a/span")).click();
	
		
		Thread.sleep(9000);*/
		String parent =driver.getWindowHandle();
		driver.findElement(By.xpath("//*[@class='a-size-medium s-inline  s-access-title  a-text-normal' and @data-attribute='Steve Jobs']")).click();
		Thread.sleep(9000);
		//handling child window
		Set<String> allwindows =driver.getWindowHandles();
		System.out.println(allwindows);
		for( String child : allwindows) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				//add to cart
				driver.findElement(By.id("add-to-cart-button")).click();	
			}			
		}
		//click add to cart
		driver.findElement(By.xpath("//*[@id=\"nav-cart\"]/span[3]")).click();
		Thread.sleep(5000);
		// process to check out
		driver.findElement(By.xpath("//input[@name='proceedToCheckout']")).click();
		Thread.sleep(5000);
		//address
		driver.findElement(By.xpath("//*[@id=\"enterAddressFullName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"enterAddressFullName\"]")).sendKeys("vali");
		driver.findElement(By.xpath("//*[@id=\"enterAddressPhoneNumber\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"enterAddressPhoneNumber\"]")).sendKeys("9912344754");
		
		driver.findElement(By.xpath("//*[@id=\"enterAddressPostalCode\"]")).sendKeys("500016");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine1\"]")).sendKeys("d.no:5-2,near post office,ameerpet");
		driver.findElement(By.xpath("//*[@id=\"enterAddressAddressLine2\"]")).sendKeys("ameerpet");
		driver.findElement(By.xpath("//*[@id=\"enterAddressLandmark\"]")).sendKeys("post office");
		driver.findElement(By.xpath("//*[@id=\"enterAddressCity\"]")).sendKeys("hyd");
		driver.findElement(By.xpath("//*[@id=\"enterAddressStateOrRegion\"]")).sendKeys("ap");
		
		/*WebElement wel=driver.findElement(By.xpath("html/body/div[5]/div[2]/div/div[2]/div[1]/div/div[1]/div[1]/form/div[4]/div/select"));
		Select sel=new Select(wel);
		sel.selectByValue("RES");
		driver.findElement(By.xpath("//*[@id=\"newShippingAddressFormFromIdentity\"]/div[1]/div[1]/form/div[6]/span/span/input")).click();
		
		
		//Choose delivery option
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]/span/input")).click();
		Thread.sleep(5000);
		//select cradit card option
		driver.findElement(By.xpath("//*[@id=\"pm_new_verified_credit_card\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vccName\"]")).sendKeys("visa");
		
		driver.findElement(By.xpath("//*[@id=\"newVerifiedDebitCardNumber\"]")).sendKeys("47993263050079");
		Actions act=new Actions(driver);
		WebElement web=driver.findElement(By.xpath("//*[@id=\"new-vcc\"]/div[2]/div[2]/div[4]/span[1]/span/span/button"));
		
		act.moveToElement(web);
		driver.findElement(By.xpath("//*[@id=\"new-vcc\"]/div[2]/div[2]/div[4]/span[1]/span/span/button/span")).click();*/
		
		driver.quit();
		
		
		
	}
}
