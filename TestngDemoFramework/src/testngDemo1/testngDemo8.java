package testngDemo1;

import org.junit.Ignore;
//import org.junit.Ignore;
//import org.testng.SkipException;
import org.testng.annotations.Test;

public class testngDemo8
{
	@Test
	public void funA()
	{
		System.out.println("funA of testngDemo8");
		System.out.println(10/0);
		System.out.println("done");
	}
	@Test
	public void funB()
	{
		System.out.println("funB of testngDemo8");
		
	}
	@Test(enabled=true)   //here false so this function will not work
	public void funC()
	{
		System.out.println("funC of testngDemo8");
		//new SkipException("skip the function");
	}
	@Test @Ignore
	public void funD()
	{
		System.out.println("FunD of testngDemo8");
	}
	


}
