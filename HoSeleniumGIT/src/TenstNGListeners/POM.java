package TenstNGListeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM extends Base_Page
{
	@FindBy (name = "email")
	private WebElement uName;
	
	@FindBy (name = "pass")
	private WebElement pWord;
	
	@FindBy (name = "login")
	private WebElement loginBtn;
	
	public POM (WebDriver driver)
	{
		super(driver);
	}
	
	public void passUn (String un)
	{
		uName.sendKeys(un);
	}
	
	public void passPwd (String pwd)
	{
		pWord.sendKeys(pwd);
	}
	
	public void clickBtn()
	{
		loginBtn.click();
	}

}
