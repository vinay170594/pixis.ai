package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
   public LoginPage(WebDriver driver)
   {
	    super(driver);
   }
   //Element
   @FindBy(id="email")
   WebElement loginText;
  
   @FindBy(id="password")
   WebElement passwordText;
   
   @FindBy(id="btn-login")
   WebElement logInButton;
   
   @FindBy(id="link-forgot-password")
   WebElement forgotPassButton;
   
   
   
   //Action method
   public void setEmail(String email)
   {
	   loginText.sendKeys(email);
   }
    
   public void setPassword(String password)
   {
     passwordText.sendKeys(password);
   }
   
   public void clickLoginButton()
   {
	   logInButton.click();
   }
   
   public String getTitle()
   {
//	   try
//	   {
	   return driver.getTitle();
//	   }
//	   catch(Exception e)
//	   {
//		  return e.getMessage();
//	   }
//  }
   }
   
   public void clickforgotPassButton()
   {
	   forgotPassButton.click();
   }
   

   
   

}
