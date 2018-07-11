package groups;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class groups {

	
	@BeforeMethod
	public void Setup()
	{
		System.out.println("lanche the browser");
		
	}
	
	@Test(groups="test")
	public void test1()
	{
		System.out.println("run the test 1");
	}
	
	@Test(groups="test")
	public void test2()
	{
		System.out.println("run the test 2");
	}
	
	@Test(groups="test")
	public void test3()
	{
		System.out.println("run the test 3");
	}
	
	@Test(groups="test")
	public void test4()
	{
		System.out.println("run the test 4");
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("close the session");
	}
	
}
