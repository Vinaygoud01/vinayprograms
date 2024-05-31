package TestngFramewokDemo;

import org.junit.Ignore;
import org.testng.annotations.Test;

@Ignore
public class TestngDemo2 {

	@Test
	public void funA() {
		System.out.println("funA of TestNGDemoclass ");
	}

	@Test
	public void funB() {
		System.out.println("funB of TestNGDemoclass ");
	}

	@Test
	public void funC() {
		System.out.println("funC of TestNGDemoclass ");
	}

	@Ignore @Test
	public void funD() {
		System.out.println("funD of TestNGDemoclass ");
	}
}
