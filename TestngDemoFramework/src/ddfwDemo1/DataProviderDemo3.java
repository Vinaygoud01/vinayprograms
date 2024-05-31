package ddfwDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo3
{
	@Test(dataProvider="setData")
	public void funA(int a,int b)
	{
		System.out.println(a);
	}
	
	@DataProvider
	public Object[][] setData()
	{
		Object o1[][] =new Object[3][2];
		
		o1[0][0]=10;
		o1[0][1]=20;
		o1[1][0]=30;
		o1[1][1]=40;
		o1[2][0]=50;
		o1[2][1]=60;
		return o1;

		
	}
}
