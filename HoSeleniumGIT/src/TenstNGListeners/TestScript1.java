package TenstNGListeners;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestScript1 extends Base_Test
{
	@Test (dataProvider = "testdata")
	public void test1(String d1, String d2) throws InterruptedException
	{
		POM p = new POM (driver);
		p.passUn(d1);
		Thread.sleep(2000);
		p.passPwd(d2);
		Thread.sleep(2000);
		p.clickBtn();
		Assert.fail();
	}
	
	@DataProvider (name = "testdata")
	public Object[][] createData1()
	{
		return new Object[][]
				{
			{"Santhosh","1234"},
				};
			
			
	}

}
