package Annotations;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
  @Test
  public void funA() 
  {
	  System.out.println("funA of AnnotationDemo2");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of AnnotationDemo2");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeclass of AnnotationDemo2");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("beforeTest of AnnotationDemo2");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforeSuite of AnnotationDemo2" );
  }

}
