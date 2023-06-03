package TestNGChapter.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestScriptVerifySoft extends GenericScript
{
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement (By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("admin");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	    String title = driver.getTitle();
	    SoftAssert sa = new SoftAssert();
	    sa.assertEquals(title,"Facebook");
	    System.out.println (1);
	    sa.assertAll();
	}

}
