package TestngFramewokDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestngAnnotationDemo2 {
  @Test
  public void funA()
  {
	  System.out.println("funA of TestngAnnotationDemo2");
  }
  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("afterMethod of TestngAnnotationDemo2");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterClass of TestngAnnotationDemo2");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest of TestngAnnotationDemo2");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("afterSuite of TestngAnnotationDemo2");
  }

}
