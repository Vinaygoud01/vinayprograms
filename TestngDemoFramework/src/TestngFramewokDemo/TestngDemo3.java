package TestngFramewokDemo;

import org.junit.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners
//(TestListenerclass.class)
public class TestngDemo3 {

	@Test(priority=-3)
	public void funA() {
		System.out.println("funA of TestNGDemoclass ");
	}

	@Test(priority=-1)
	public void funB() {
		System.out.println("funB of TestNGDemoclass ");
	}

	@Test(priority=-4)
	public void funC() {
		System.out.println("funC of TestNGDemoclass ");
	}

	@Ignore 
	public void funD() {
		System.out.println("funD of TestNGDemoclass ");
	}
	@Ignore @Test(enabled=true)
	public void funE() {
		System.out.println("funE of TestNGDemoclass ");
	}
}
