package BookSearch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BookFind {

	@Test
	public void main() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\T\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		

		driver.navigate().to("https://www.amazon.in");
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]")).click();
		driver.findElement(By.id("ap_email")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("vali@786");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("abdul kalam books");
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(10000);
		WebElement wl=driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[2]/span"));
		
		Actions as=new Actions(driver);
		as.moveToElement(wl);

	}

}
