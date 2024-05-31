package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertDemo2 
{
	@Test
	public void compare()
	{
		boolean b1=true;
		//boolean b2=false;
		Assert.assertTrue(b1);
		System.out.println("done");  //here statement is true so it executed
	}
	@Test
	public void compare1()
	{
		//boolean b1=true;
		boolean b2=false;
		Assert.assertTrue(b2);
		System.out.println("done1");  //after the failure statement it wont executeft
	}
	
	

}
