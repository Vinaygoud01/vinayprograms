package TestngFramewokDemo;

import org.testng.annotations.Test;

public class TestngDemo4A
{
	
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("LoginTest of TestngDemo4");
	}
	@Test(priority=1)
	public void CustomerDetails()
	{
		System.out.println("CustomerDetails of TestngDemo4");
	}

}
