package Sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Keys;

import genericlib.Iconstantutility;

public class WriteDataInExcel {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(Iconstantutility.excelpath);
	    Workbook book=WorkbookFactory.create(fis);
	    Sheet sh=book.getSheet("Sheet1");
	    sh.createRow(9).createCell(1).setCellValue("Welcome");
	    sh.createRow(10).createCell(1).setCellValue("Bye");
	    FileOutputStream fos=new FileOutputStream(Iconstantutility.excelpath);
	    book.write(fos);
	    System.out.println("Pass");
	}

}
