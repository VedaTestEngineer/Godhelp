package ParallelExecutionChapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelExec 
{
	public WebDriver driver;
	@Parameters ({"browsers"})
	@Test
	public void test1 (String browser)
	{
		System.setProperty("webdriver.chrome.driver", "./HoSoftwares/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver","./HoSoftwares/geckodriver.exe");
		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
		}
		else
		{
			driver = new FirefoxDriver();
			driver.get("https://www.facebook.com");
		}
		
	}
	

}
