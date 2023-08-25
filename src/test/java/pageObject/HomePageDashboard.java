package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageDashboard extends BasePage
{
	   public HomePageDashboard(WebDriver driver)
	   {
		    super(driver);
	   }
	   
	   @FindBy(xpath="//div[@class='MuiBox-root css-0']")
	   WebElement pixisLogo;
	   
	   public void pixisLogoClick()
	   {
		   pixisLogo.click();
	   }
	   


}
