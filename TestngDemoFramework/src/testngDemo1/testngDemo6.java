package testngDemo1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngDemo6
{
	@Test (priority=0)
	public void funA()
	{
		System.out.println("FunA of testngDemo6");
	}
	@BeforeTest
	public void funB()
	{
		System.out.println("funB of testngDemo6");
	}
	@Test (priority=1)
	public void funC()
	{
		System.out.println("funC of testngDemo6");
	}

}
