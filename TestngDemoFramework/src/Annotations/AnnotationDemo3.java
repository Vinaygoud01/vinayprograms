package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AnnotationDemo3 {
  @Test
  public void funA()
  {
	  System.out.println("funA of AnnotationDemo3");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("afterMethod of  AnnotationDemo3");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterclass  of AnnotationDemo3");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest  of AnnotationDemo3");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("aftersuite  of AnnotationDemo3");
  }

}
