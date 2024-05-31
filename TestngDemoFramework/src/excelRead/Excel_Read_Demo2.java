package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Read_Demo2
{
	@Test
	public void excelRead() throws Throwable
	{
		FileInputStream file=new FileInputStream("C://Users//ADMIN//Desktop//seleniumframework//XLdata//XLBook1.xlsx");
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet= book.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(3);
		String data=cell.getStringCellValue();
		
		System.out.println(data);
	}

}
