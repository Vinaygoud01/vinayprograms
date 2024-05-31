package iopackage;

import java.io.File;

import org.testng.annotations.Test;

public class FileDemo1 
{
	@Test
	public void FileDemo()
	{
		File file=new File("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\abc");  //here it created one folder
	//	file.mkdir();  //mkdir is for creating last folder
		System.out.println(file.exists());  //in console it shows weather the given path is true or false
		
//		File file2=new File("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\x\\y\\z"); 
//		file2.mkdir();
		
		File file2=new File("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\x\\y\\z");  //here to create one folder in other folder
		file2.mkdirs();
	}

}
