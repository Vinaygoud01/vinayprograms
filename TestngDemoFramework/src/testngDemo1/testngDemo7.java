package testngDemo1;

import org.testng.annotations.Test;

public class testngDemo7
{
	@Test
	public void login()
	{
		System.out.println("login of testngDemo7");
		System.out.println(10/0);
	}
	@Test (dependsOnMethods="login")  //if login function is failed then createaccount function is skipped
	public void createaccount()
	{
		
		System.out.println("createaccount for testngDemo7");
	}

}
