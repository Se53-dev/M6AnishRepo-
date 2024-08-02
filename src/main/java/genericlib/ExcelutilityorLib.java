package genericlib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelutilityorLib {
	public String readDatafromexcel(String Sheetname, int rownum, int cellnum) throws Exception
	{
		FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(Sheetname);
		DataFormatter format=new DataFormatter();
		//String Value=format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		Row r=sh.getRow(rownum);
		Cell c=r.getCell(cellnum);
		String value=format.formatCellValue(c);
		return value;
		
		
		
	}


public void readMultipleDataFromExcel(String Sheetname, int firstrownum, int firstcellnum) throws Exception
{
FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
Workbook book=WorkbookFactory.create(fis);
Sheet sh=book.getSheet(Sheetname);
DataFormatter format=new DataFormatter();
for(int i=firstrownum;i<=sh.getLastRowNum();i++)
{
Row r=sh.getRow(i);
for(int j=firstcellnum;j<=r.getLastCellNum()-1;j++) {
	String values=format.formatCellValue(r.getCell(j));
	System.out.println(values);
}
}
}
/**
 * this is a generic method to write data in excel
 * @param sheetname
 * @param rowNum
 * @param cellNum
 * @param value
 * @author Anish Babu
 * @version 7.1.24
 * @throws Exception 
 */
public void WriteDataInExcel(String sheetname, int rowNum, int cellNum, String value) throws Exception
{
	FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet(sheetname);
	sh.createRow(rowNum).createCell(cellNum).setCellValue(value);
	FileOutputStream fos=new FileOutputStream(Iconstantutility.excelpath);
	book.write(fos);
	
}
}