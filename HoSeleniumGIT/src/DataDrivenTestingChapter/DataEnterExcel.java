package DataDrivenTestingChapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataEnterExcel 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream ("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet2");
		Row row = sheet.createRow(1);
		Cell cell = row.createCell(1);
		cell.setCellValue ("Selenium");
		FileOutputStream fos = new FileOutputStream("./Excel/TestData.xlsx");
		book.write(fos);
		

	}

}
