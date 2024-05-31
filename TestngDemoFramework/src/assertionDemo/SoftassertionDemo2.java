package assertionDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertionDemo2   //p1 cases uses hard assertions  //soft assertions is for field validation
{
	//Hard assertion -- throws an exception immediately when an assert statement fails.test steps after hard assertion will not be executed and the next test in the test suite will start
	//soft assertion -- do not throws an exception immediately when an assertion fails
	@Test
	public void SoftAssertion1()
	{
		boolean b1=true;
		boolean b2=false;
		SoftAssert s1= new SoftAssert();
		s1.assertFalse(b1);
		s1.assertAll();  //if we dont use this function it wont perform
		System.out.println("done1");
	

	}
	@Test
	public void SoftAssertion2()
	{
		boolean b3=true;
		boolean b4=false;
		SoftAssert s2= new SoftAssert();
		s2.assertFalse(b3,"the actual is not matched"); //description is in double codes
		s2.assertAll();
		
	}
	@Test
	public void SoftAssertion3()
	{
		boolean b5=false;
		boolean b6=true;
		SoftAssert s3= new SoftAssert();
		s3.assertTrue(b6);  //case passed  //here first case is passed so next statements are executed
		s3.assertAll();     //if first the case is failed then nothing will execute
		s3.assertTrue(b5);  //case failed
		System.out.println("done3");
		
	}

}
