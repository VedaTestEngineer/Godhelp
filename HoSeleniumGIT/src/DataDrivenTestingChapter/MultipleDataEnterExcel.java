package DataDrivenTestingChapter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleDataEnterExcel 
{

	public static void main(String[] args) throws InterruptedException, IOException
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet3");
		System.setProperty("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		for (int i=0; i<count; i++)
		{
			String value = links.get(i).getAttribute("href");
			Row row = sheet.createRow(i);
			Cell cell = row.createCell(0);
			cell.setCellValue(value);
		}
		FileOutputStream fos = new FileOutputStream ("./Excel/TestData.xlsx");
		book.write(fos);

	}

}
