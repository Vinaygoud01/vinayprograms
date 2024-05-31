package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadHYR 
{
	public static void main(String[] args) throws Exception 
	{
		FileInputStream file=new FileInputStream("C://Users//ADMIN//Desktop//seleniumframework//XLdata//XLBook1.xlsx");
		XSSFWorkbook book= new XSSFWorkbook(file);
		XSSFSheet sheet= book.getSheet("Sheet1");
		int NoofRows=sheet.getPhysicalNumberOfRows();
		System.out.println(NoofRows);
		int NoofColumns=sheet.getRow(0).getLastCellNum();
		System.out.println(NoofColumns);
		
//		for(int i=1; i<NoofRows;i++)
//		{
//			for(int j=0; i<NoofColumns;j++)
//			{
//				//DataFormatter df=new DataFormatter();  //it will convert any type of data into string datatype
//            	//System.out.println(df.formatCellValue(sheet.getRow(i).getCell(j)));
//            	System.out.println(sheet.getRow(i).getCell(j));
//			}
//			System.out.println();
//	}
//		book.close();
//		file.close();
//
	}
}
