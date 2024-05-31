package assertionDemo;

import org.testng.annotations.Test;

public class assertDescription 
{
	@Test
	public void Assert()
	{
		System.out.println(" assertDescription");
		String s1="java";
		String s2="java"; //both strings are same so passed assert
		//if strings are different then failed assert then logs will displays on the screen
		org.testng.Assert.assertEquals(s1, s2,"case will pass and data is not matched");
	}

}
