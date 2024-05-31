package TestngFramewokDemo;

import org.testng.annotations.Test;

public class TestNgInvocation 
{
	@Test(priority=0,invocationCount=3)
	public void loginTest()
	{
		System.out.println("LoginTest of TestngDemo4");
	}
	@Test(priority=1,invocationCount=5,invocationTimeOut=2000)
	public void CustomerDetails()
	{
		System.out.println("CustomerDetails of TestngDemo4");
	}


}
