package excelRead;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel_Read_Demo6
{
	@Test
	public void excelRead() throws Throwable
	{
		FileInputStream file=new FileInputStream("C://Users//ADMIN//Desktop//seleniumframework//XLdata//XLBook1.xlsx");
		Workbook book= new XSSFWorkbook(file);
		Sheet sheet= book.getSheetAt(0);

//		Row row=sheet.getRow(0);
//	
//		Cell cell=row.getCell(0);
//		int lastrownumber =sheet.getLastRowNum();
//		System.out.println(lastrownumber);
//		int lastcellnumber = row.getLastCellNum();
//		System.out.println(lastcellnumber);

		
       
        for (Row row : sheet) {
            
            for (Cell cell : row) {
//           	DataFormatter df=new DataFormatter();  //it will convert any type of data into string datatype
//            	System.out.println(df.formatCellValue(sheet.getRow(row).getcell(cell)));
//               
                System.out.print(cell.toString()+"\t");
            }
            System.out.println(); 
        }
	}

}
