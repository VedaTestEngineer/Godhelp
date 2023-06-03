package TestNGChapter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptPriority 
{
	@Test(priority=3)
	public void data1()
	{
		Reporter.log("1",true);
	}
	
	@Test(priority=1)
	public void data2()
	{
		Reporter.log("2",true);
	}

	@Test(priority=2)
	public void data3()
	{
		Reporter.log("3",true);
	}
}
