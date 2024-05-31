package assertionDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 
{
	    @Test
		public void compare()
		{
			String s1="RBG";
			String s2="RBG";
			Assert.assertEquals(s1, s2); //Assert is a class  //classname.static member so assertEquals is a static member
			System.out.println("done");
		}
		@Test
		public void compare2()
		{
			String s1="JAVA";
			String s2="SELENIUM";
			Assert.assertEquals(s1, s2);
			System.out.println("done");
		}
		@Test
		public void compare3()
		{
			String s1="JAVA";
			String s2="SELENIUM";
			Assert.assertEquals(s1, s2);  //it is hard assert
			System.out.println("done");  //after the failed condition it wont execute
		}
	}


