package ddfwDemo1;

import org.testng.annotations.Test;

public class TestngInvokeDemo1 
{
	static int i=1;
	@Test(invocationCount=10)
	public void funA()
	{
		i=i+1;
		System.out.println("funA of TestngInvokeDemo1");
	}
	@Test
	public void funB()
	{
		System.out.println(i);
		System.out.println("funB of TestngInvokeDemo1");
	}
	

}

