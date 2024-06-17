package errorprograms;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1 
{
	@Test
	public void funA()
	{
		System.out.println("funA of TestNgInvokeDemo1");
		System.out.println();
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Object[][] o1 = new Object[3][1];
		o1[0][0] =10;
		o1[1][0] =20;
		o1[2][0] =30;
		return o1;
	}


}
