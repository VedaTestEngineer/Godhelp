package BasicHybridFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericScriptBHF 
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppn() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeAppn()
	{
		driver.close();
	}
	

}
