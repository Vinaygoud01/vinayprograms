package iopackage;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertiesFileReadDemo1
{
	@Test
	public void PropertiesFileRead() throws Throwable 
	{
		FileInputStream finput=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\Test1.properties");  
		Properties p1=new Properties();
		p1.load(finput);   
		String data1=p1.getProperty("BrowserName");   //in the text file BrowserName=chrome so in console it is showing chrome
		System.out.println(data1);
	}

}
