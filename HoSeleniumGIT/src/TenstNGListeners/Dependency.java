package TenstNGListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency 
{
	@Test
	public void test1()
	{
		System.out.println ("India");
	}
	
	@Test
	public void test2()
	{
		System.out.println ("Asia");
		Assert.fail();
	}
	
	@Test (dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println ("World");
	}

}
