package BasicHybridFramework;

import org.testng.annotations.Test;

public class TestScriptBHF extends GenericScriptBHF
{
	@Test
	public void validLgin()
	{
		POMSCriptBHF p = new POMSCriptBHF (driver);
		p.username("abc");
		p.pword("123");
		p.clklgin();
	}

}
