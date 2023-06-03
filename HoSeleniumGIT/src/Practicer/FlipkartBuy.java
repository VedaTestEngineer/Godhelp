package Practicer;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartBuy 
{

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty ("webdriver.chrome.driver","./HoSoftwares/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[text()='✕']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Watches");
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(),'Gold Case Black Strap Electronic Digital Watch')]")).click();
		 Set<String> allwh = driver.getWindowHandles();
		 for (String wh : allwh)
		 {
			 driver.switchTo().window(wh);
		 }
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		 Thread.sleep(10000);
		 driver.findElement(By.xpath("//span[normalize-space()='Place Order']")).click();


	}

}
