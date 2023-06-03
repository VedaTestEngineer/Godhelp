package POMChapter.LoginHardCode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScriptGeneric 
{
	@Test
	public void validLogin() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./HoSoftwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get ("https://www.facebook.com");
		Thread.sleep(2000);
		POMLoginScript p = new POMLoginScript(driver);
		p.unData("abc");
		p.pwdData("123");
		p.clkLogin();
		
	}

}
