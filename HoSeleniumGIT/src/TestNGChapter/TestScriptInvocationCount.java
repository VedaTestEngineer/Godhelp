package TestNGChapter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptInvocationCount 
{
	@Test(invocationCount=2)
	public void data1()
	{
		Reporter.log("1",true);
	}
	
	@Test(invocationCount=3)
	public void data2()
	{
		Reporter.log("2",true);
	}
	
	@Test(invocationCount=4)
	void data3()
	{
		Reporter.log("3",true);
	}
	
	
	

}
