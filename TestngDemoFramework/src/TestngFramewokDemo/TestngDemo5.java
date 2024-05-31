package TestngFramewokDemo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestngDemo5 {

	@Test
	public void funA() {
		System.out.println("funA of TestNGDemoclass ");
	}

	@Test
	public void funB() {
		System.out.println("funB of TestNGDemoclass ");
		System.out.println(0/0);
	}

	@Test
	public void funC() throws Exception {
		System.out.println("funC of TestNGDemoclass ");
		//throw new Exception();
		throw new SkipException("FunC skip");    //it skips this function
		
	}

	@Test(enabled=false)
	public void funD() {
		System.out.println("funD of TestNGDemoclass ");
	}
}
