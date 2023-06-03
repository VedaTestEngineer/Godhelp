package POMChapter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMGenericRefresh
{
	@FindBy (name="login")
	private WebElement lginBtn;
	
	public POMGenericRefresh (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clkLogin()
	{
		lginBtn.click();
	}

}
