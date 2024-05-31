package ddfwDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderRP 
{
	@Test(dataProvider="loginTestData")
	public void test(String userName,String PassWord)
	{
		System.out.println(userName);
		System.out.println(PassWord);
	}
	
	@DataProvider(name="loginTestData")
	public Object[][] loginData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin12";
		data[1][0]="Admin";
		data[1][1]="admin123";
		return data;


	}

}
