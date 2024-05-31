package TestngFramewokDemo;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotationDemo3 {
  @Test
  public void funA()
  {
	  System.out.println("funA of TestngAnnotationDemo3");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("beforeMethod of TestngAnnotationDemo3");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("beforeClass of TestngAnnotationDemo3");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("beforeTest of TestngAnnotationDemo3");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("beforeSuite of TestngAnnotationDemo3");
  }

}
