package TestngFramewokDemo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertionDemo1 
{
	@Test
	public void funA()
	{
		SoftAssert softAssert1 =new SoftAssert(); //softassert is a predefined program
		String ExpectedData="RBG technologies";
		String ActualData="selenium";
		softAssert1.assertEquals(ActualData, ExpectedData);
		System.out.println("funA case1 done");
		
		String ExpectedData2="RBG technologies";
		String ActualData2="selenium";
		softAssert1.assertEquals(ActualData, ExpectedData);
		System.out.println("funA case2 done");
		System.out.println("All are done");
	}
	
	@Test
	public void funB()
	{
		SoftAssert softAssert1 =new SoftAssert(); //softassert is a predefined program
		String ExpectedData="RBG technologies";
		String ActualData="selenium";
		softAssert1.assertEquals(ActualData, ExpectedData);
		System.out.println("funB case1 done");
		
		String ExpectedData2="RBG technologies";
		String ActualData2="selenium";
		softAssert1.assertEquals(ActualData, ExpectedData);
		System.out.println("funB case2 done");
		softAssert1.assertAll(); //by using this it will terminate the softassertion next statemenets will not execute
		System.out.println("All are Done");
	}
	@Test
	public void funC()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="RBG technologies";
		softAssert1.assertNotEquals(ExpectedData, ActualData);
		System.out.println("func case1 done");
		
		String ExpectedData3="RBG technologies";
		String ActualData3="RBG technologies";
		softAssert1.assertNotEquals(ExpectedData3, ActualData3);
		System.out.println("func case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	@Test
	public void funD()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="Selenium";
		softAssert1.assertNotEquals(ExpectedData, ActualData);
		System.out.println("funD case1 done");
		
		String ExpectedData4="RBG technologies";
		String ActualData4="Selenium";
		softAssert1.assertNotEquals(ExpectedData4, ActualData4);
		System.out.println("funD case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	@Test
	public void funE()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="RBG technologies";
		softAssert1.assertTrue(true);
		System.out.println("funE case1 done");
		
		String ExpectedData5="RBG technologies";
		String ActualData5="RBG technologies";
		softAssert1.assertTrue(true);
		System.out.println("funE case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	@Test
	public void funF()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="Selenium";
		softAssert1.assertTrue(false);
		System.out.println("funF case1 done");
		
		String ExpectedData6="RBG technologies";
		String ActualData6="Selenium";
		softAssert1.assertTrue(false);
		System.out.println("funF case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	@Test
	public void funG()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="RBG technologies";
		softAssert1.assertFalse(true);
		System.out.println("funG case1 done");
		
		String ExpectedData7="RBG technologies";
		String ActualData7="RBG technologies";
		softAssert1.assertFalse(true);
		System.out.println("funG case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	@Test
	public void funH()
	{
		SoftAssert softAssert1 =new SoftAssert(); 
		String ExpectedData="RBG technologies";
		String ActualData="Selenium";
		softAssert1.assertFalse(false);
		System.out.println("funH case1 done");
		
		String ExpectedData8="RBG technologies";
		String ActualData8="Selenium";
		softAssert1.assertFalse(false);
		System.out.println("funH case2 done");
		softAssert1.assertAll(); 
		System.out.println("All are Done");
	}
	

}
