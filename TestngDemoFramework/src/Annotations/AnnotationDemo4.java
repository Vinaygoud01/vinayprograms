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

public class AnnotationDemo4 {
  @Test
  public void funA()
  {
	  System.out.println("funA Of AnnotationDemo4");
  }
  @Test
  public void funB()
  {
	  System.out.println("funB Of AnnotationDemo4");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforemethod Of AnnotationDemo4");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("aftermethod Of AnnotationDemo4");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("beforeclass Of AnnotationDemo4");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("afterclass Of AnnotationDemo4");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest Of AnnotationDemo4");
	  
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("afterTest Of AnnotationDemo4");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforesuite Of AnnotationDemo4");
  }

  @AfterSuite
  public void afterSuite() 
  {
	  System.out.println("afterSuite Of AnnotationDemo4");
  }

}
