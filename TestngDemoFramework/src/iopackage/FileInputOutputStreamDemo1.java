package iopackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.testng.annotations.Test;

public class FileInputOutputStreamDemo1
{
	@Test
	public void FileInputOutputStreamTest() throws IOException 
	{
		FileOutputStream fout=new FileOutputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\test1.txt");   ///it created one file it is writing class
	//	FileInputStream finput=new FileInputStream("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\test2.txt");    //already available data is it will read
		File file=new File("C:\\Users\\ADMIN\\Desktop\\selenium framework\\IODemo\\test2.txt");   //it is a supporting file
		file.createNewFile();  //it is creating one file
		System.out.println("done");
	}

}
