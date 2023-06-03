package TestNGChapter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScriptDependsOnMethods
{
	@Test
	public void compose()
	{
		Reporter.log("compose",true);
	}
	
	@Test
	public void sentItems()
	{
		Reporter.log("Sent Items",true);
	}
	
	@Test
	public void Trash()
	{
		Reporter.log("Trash",true);
	}

}
