package TestNGChapter.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.SoftAssert;

public class TestScriptVerify extends GenericScript
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement (By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	    String title = driver.getTitle();
	    //SoftAssert sa = new SoftAssert();
	    Assert.assertEquals(title,"Facebook – log in or");
	    System.out.println (1);
	    
	    

	}

}
