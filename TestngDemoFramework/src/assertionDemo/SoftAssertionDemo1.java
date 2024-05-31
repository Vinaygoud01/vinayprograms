package assertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionDemo1 
{
	@Test
	public void softAssertion01()
	{
		String s1="ABC";
		String s2="DEF";
		SoftAssert s3 =new SoftAssert();  //soft assertion --if both the strings are not same then also next statements will execute
		s3.assertEquals(s1, s2);
		System.out.println("done");
		s3.assertAll();  //if this is not there then the function comes as passed
	}
	@Test
	public void softAssertion02()
	{
		String s1="vinay";
		String s2="vinay";
		SoftAssert s3 =new SoftAssert();  //soft assertion 
		s3.assertEquals(s1, s2);
		System.out.println("done");
		s3.assertAll();
	}


}
