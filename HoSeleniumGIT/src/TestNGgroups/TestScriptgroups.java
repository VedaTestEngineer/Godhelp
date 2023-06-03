package TestNGgroups;

import org.testng.annotations.Test;

public class TestScriptgroups 
{
	@Test (groups = {"sanity"})
	public void data1()
	{
		System.out.println ("Hello India");
	}
	
	@Test (groups = {"smoke"})
	public void data2()
	{
		System.out.println ("Hello Asia");
	}
	
	@Test (groups = {"sanity", "smoke"})
	public void data3()
	{
		System.out.println ("Hello World");
	}

}
