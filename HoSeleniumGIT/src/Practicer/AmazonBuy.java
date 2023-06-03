package Practicer;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBuy 
{

	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty ("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.amazon.in");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("Watches");
	 driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	 driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]/span[1]")).click();
	 /*Actions act = new Actions(driver);
	 act.moveToElement(ele).click();*/
	 Set<String> allwh = driver.getWindowHandles();
	 for (String wh : allwh)
	 {
		 driver.switchTo().window(wh);
	 }
	 Thread.sleep(10000);
	 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	 Thread.sleep(10000);
	 driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']")).click();
	}

}
