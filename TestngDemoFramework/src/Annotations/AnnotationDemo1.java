package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo1 {  
	//Annotations are used to describe a batch of code inserted into the program or business logic used to control the flow of methods in the test script
	//it makes selenium test scripts more manageable and effective
  @Test
  public void funA() 
  {
	 System.out.println("funA of AnnotationDemo1 "); 
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of AnnotationDemo1");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod of AnnotationDemo1");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of AnnotationDemo1");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("afterclass of AnnotationDemo1");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest of AnnotationDemo1");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of AnnotationDemo1");
  }

  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("beforeSuite of AnnotationDemo1");
  }

  @AfterSuite
  public void afterSuite()  //it will perform last and shows in a different console
  {
	  System.out.println("afterSuite of of AnnotationDemo1");
  }

}
