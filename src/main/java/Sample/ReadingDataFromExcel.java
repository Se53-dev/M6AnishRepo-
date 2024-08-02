package Sample;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadingDataFromExcel {
	public static void main(String[] args) throws Exception, Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\PARVATHI ANIL\\Desktop\\Automation Testing\\Selinum Locators\\M6Testcasedata.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sample");
		//Row r=sh.getRow(2);
		//Cell c=r.getCell(4);
		//String Value=c.getStringCellValue();
		//String Value=sh.getRow(10).getCell(6).getStringCellValue();
		DataFormatter df=new DataFormatter();
		String Value=df.formatCellValue(sh.getRow(10).getCell(6));
		System.out.println(Value);
		
		
		
	}

}
