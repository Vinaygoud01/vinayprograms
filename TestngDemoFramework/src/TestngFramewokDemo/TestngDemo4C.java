package TestngFramewokDemo;

import org.testng.annotations.Test;

public class TestngDemo4C
{
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("LoginTest of TestngDemo4");
		System.out.println(0/0);
	}
	@Test(priority=1,dependsOnMethods="loginTest")  //by using dependsOnMethods if login is failed then this function is skipped
	public void CustomerDetails()
	{
		System.out.println("CustomerDetails of TestngDemo4");
	}

}
