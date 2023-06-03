package DataDrivenTestingChapter;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataEnterFacebook 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("./Excel/TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet("Sheet1");
		System.setProperty("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		for (int i=0; i<3; i++)
		{
			Row row = sheet.getRow(i);
			Cell rcell = row.getCell(0);
			String rvalue = rcell.toString();
			Cell cell = row.getCell(1);
			String value = cell.toString();
			driver.findElement(By.id("email")).sendKeys(rvalue);
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys(value);
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			Thread.sleep(2000);
		}
		

	}

}
