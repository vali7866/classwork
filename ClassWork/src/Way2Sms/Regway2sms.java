package Way2Sms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Regway2sms {
	@Test
	public void main() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\T\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"Login\"]/div[1]/input")).click();
		driver.findElement(By.xpath("//*[@id=\"male\"]/i")).click();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("vali");
		
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).sendKeys("19/09/1990");
		/*driver.findElement(By.id("dob")).sendKeys("12");
		driver.findElement(By.id("dob")).sendKeys("1990");*/
		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("meravali143@gmail.com");
		driver.findElement(By.id("cemail")).sendKeys("meravali143@gmail.com");
		Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"city\"]")));
		sel.selectByIndex(169);
		driver.findElement(By.xpath("//*[@id=\"mno1\"]")).sendKeys("9912344754");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"terms\"]/b")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"reg1\"]/div/input")).click();
		Thread.sleep(20000);
		driver.findElement(By.xpath("//*[@id=\"reg2\"]/input[2]")).click();
		
		
		
		
	}

}
