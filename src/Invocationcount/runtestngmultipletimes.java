package Invocationcount;

import org.testng.annotations.Test;

public class runtestngmultipletimes {

	@Test(invocationCount=5)
	public void sum()
	{
		
		int a=20;
		int b=30;
		int c=80;
		int d=a+b+b+c;
		int e=d-a;
		System.out.println("sum is   ------"+ d);
		System.out.println("sum is   ------"+ e);
	}
	
}
