package DataDrivenTestingChapter;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchTheData 
{
	public static void main (String[] args) throws IOException
	{
		//Step1
		FileInputStream fis = new FileInputStream("C:\\Users\\kantharaj\\eclipse-workspace\\HoSelenium\\Excel\\TestData.xlsx");
		//Step2
		Workbook book = WorkbookFactory.create(fis);
		//Step3
		Sheet sh = book.getSheet("Sheet1");
		//Step4
		Row row = sh.getRow (0);
		//Step5
		Cell c = row.getCell (0);
		//Step6
		String value = c.toString();
		System.out.println (value);
		
		
	}

}
