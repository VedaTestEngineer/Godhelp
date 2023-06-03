package POMChapter.LoginHardCode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginScript 
{
	@FindBy (name = "email")
	private WebElement username;
	
	@FindBy (name = "pass")
	private WebElement pass;
	
	@FindBy (name = "login")
	private WebElement lgin;
	
	public POMLoginScript (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void unData(String un)
	{
		username.sendKeys(un);
	}
	
	public void pwdData(String pwd)
	{
		pass.sendKeys("pwd");
	}
	
	public void clkLogin ()
	{
		lgin.click();
	}
	
	

}
