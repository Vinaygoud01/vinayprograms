package testngDemo1;

import org.testng.annotations.Test;

public class testngDemo5 
{
	@Test (description="FunA for login case")
public void funA()
{
	System.out.println("funA of testngDemo5");
}
	@Test (priority=1,description="FunB for login case")
	public void funB()
	{
		System.out.println("funB of testngDemo5");
	}
}
