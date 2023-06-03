package POMChapter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import TestNGChapter.TestCases.GenericScript;

public class POMPageRefresh extends GenericScript
{
	@Test
	public void pageRefresh() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.name("login"));
		ele.click();
		driver.navigate().refresh();
		Thread.sleep(2000);
		ele.click();
		Thread.sleep(2000);
		System.out.println (driver.getTitle());		
		
	}
	

}
