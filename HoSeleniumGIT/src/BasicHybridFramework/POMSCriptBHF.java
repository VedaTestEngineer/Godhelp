package BasicHybridFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMSCriptBHF 
{
	@FindBy (name = "email")
	private WebElement usname;
	
	@FindBy (name = "pass")
	private WebElement pwd;
	
	@FindBy (name = "login")
	private WebElement lgin;
	
	public POMSCriptBHF (WebDriver driver)
	{
		PageFactory.initElements (driver,this);
	}
    
	public void username(String un)
	{
		usname.sendKeys(un);
	}
	
	public void pword (String pd)
	{
		pwd.sendKeys(pd);
	}
	
	public void clklgin ()
	{
		lgin.click();
	}
}
