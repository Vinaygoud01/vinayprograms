package TestngFramewokDemo;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

public class HardAssertionDemo1
{
	
	 @Test
	 public void funA()
	 {
		 String ActualData="RBG technologies";
		 String ExpectedData="RBG technologies";
		 Assert.assertEquals(ActualData, ExpectedData);
//		 assertEquals(ActualData, ExpectedData);  //if we want to write like this import  this (import static org.testng.Assert.*;) then we can directly write assertequals

//		 assertTrue(false);
		 System.out.println("funA of HardAssertionDemo1 Done");
	 }
	 @Test
	 public void funB()
	 {
		 String ActualData="RBG technologies";
		 String ExpectedData="Selenium";
		 Assert.assertEquals(ActualData, ExpectedData);
		 System.out.println("funB of HardAssertionDemo1 Done");
		 //hard assertion --test steps after hard assertion will not be executed and the next test in the test suite will start
			//soft assertion -- do not throws an exception immediately when an assertion fails
		 
	 }

}
