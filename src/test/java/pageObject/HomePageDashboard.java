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
	   
	   //@FindBy logout locator was not found
	   //Action method
	   
	   @FindBy(xpath = "//title[text()='Pixis AI']") // HomePage title
		WebElement msgHeading;
	   
	   //@FindBy logout locator was not found
	   //Action method		
//		@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
//		WebElement lnkLogout;
		

		public boolean isHomePageTitle()   // HomePage title display status
		{
			try {
				return (msgHeading.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
		}

		public void clickLogout() {
			lnkLogout.click();

		}
	   


}
