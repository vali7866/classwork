package Gmaillogin;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Signin {
	
	@Test
	public void main() throws Exception {
		
		System.setProperty("webdriver.gecko.driver","D:\\T\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("nagul1226");
		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("varishma@143");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=':j6']/div/div")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//textarea[@aria-label='To' and @role='combobox']")).sendKeys("vinodintel2@gmail.com");
		
		
		
		driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Vali_Today_task_09/07/2018");
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("hi vinodh,                                               This is automated script ");
		driver.findElement(By.xpath("//div[@aria-label='Attach files']")).click();
		// copy option
		StringSelection selecion=new StringSelection("‪TestData1.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selecion, null);
		
		Thread.sleep(5000);
		
		
		
		
		// past option
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);;
		
		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		StringSelection selecion1=new StringSelection("‪TestData2.xlsx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selecion1, null);
		
		Thread.sleep(5000);
		
		
		
		
		// past option
		
		Robot robot1=new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);;
		
		Thread.sleep(5000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		
		
		driver.findElement(By.xpath("//div[@data-tooltip-delay='800']")).click();
		
		
		
		
		
	}

}
