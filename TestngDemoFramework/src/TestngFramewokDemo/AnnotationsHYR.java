package TestngFramewokDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsHYR 
{
	 @Test
	  public void funA()
	  {
		  System.out.println("funA of TestngAnnotationDemo4");
	  }

	 @Test
	  public void funB()
	  {
		  System.out.println("funB of TestngAnnotationDemo4");
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		  System.out.println("beforeMethod of TestngAnnotationDemo4");
	  }

	  @AfterMethod
	  public void afterMethod()
	  {
		  System.out.println("afterMethod of TestngAnnotationDemo4");
	  }

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.out.println("beforeClass of TestngAnnotationDemo4");
	  }

	  @AfterClass
	  public void afterClass() 
	  {
		  System.out.println("afterClass of TestngAnnotationDemo4");
	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("beforeTest of TestngAnnotationDemo4");
	  }

	  @AfterTest
	  public void afterTest()
	  {
		  System.out.println("afterTest of TestngAnnotationDemo4");
	  }

	  @BeforeSuite
	  public void beforeSuite() 
	  {
		  System.out.println("beforeSuite of TestngAnnotationDemo4");
	  }

	  @AfterSuite
	  public void afterSuite() 
	  {
		  System.out.println("afterSuite of TestngAnnotationDemo4");
	  }
}
