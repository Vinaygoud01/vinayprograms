package TestngFramewokDemo;

import org.testng.annotations.Test;

public class TestngGroupDemo1 
{
	@Test(groups="Regression")
	public void funA()
	{
		System.out.println("funA of TestngGroupDemo1");
	}
	@Test(groups="Regression")
	public void funB()
	{
		System.out.println("funB of TestngGroupDemo1");
	}
	@Test(groups="Sanity")
	public void funC()
	{
		System.out.println("funC of TestngGroupDemo1");
	}
	@Test(groups="Sanity")
	public void funD()
	{
		System.out.println("funD of TestngGroupDemo1");
	}

	
	

}
