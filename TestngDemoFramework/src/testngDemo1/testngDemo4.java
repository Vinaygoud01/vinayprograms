package testngDemo1;

import org.testng.annotations.Test;

public class testngDemo4   //According to the priority wise it will execute
{
	@Test (priority=2)
	public void funB()
	{
		System.out.println("funB of TestNGDemoclass ");
	}
		@Test (priority=4)
	public void funD()
	{
		System.out.println("funD of TestNGDemoclass ");
	}
		@Test (priority=1)
	public void funC()
	{
		System.out.println("funC of TestNGDemoclass ");
	}
		@Test (priority=3)
	public void funA()
	{
		System.out.println("funA of TestNGDemoclass ");
	}

}
