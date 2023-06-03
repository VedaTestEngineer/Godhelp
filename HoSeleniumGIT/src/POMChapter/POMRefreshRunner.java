package POMChapter;

import org.testng.annotations.Test;

public class POMRefreshRunner extends GenericPOM
{
	@Test
	public void refresher() throws InterruptedException
	{
		POMGenericRefresh p = new POMGenericRefresh(driver);
		p.clkLogin();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		p.clkLogin();
	}
	

}
