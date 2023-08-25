package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends BasePage
{
	public ResetPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//div[@class='mt-5 font-40 font-700 text-emperor']")
	WebElement resetPass;
	
	public String getText()
	{
		return resetPass.getText();
	}

}
