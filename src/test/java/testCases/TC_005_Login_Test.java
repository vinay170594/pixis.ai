package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.LoginPage;
import pageObject.ResetPasswordPage;
import testBase.BaseClass;

  public class TC_005_Login_Test extends BaseClass
    {
	@Test(priority=0)
	public void test_login()
	{
	    logger.info("***  Starting Tc_005_Login_Test   ***");
	 	LoginPage lp= new LoginPage(driver);
	    logger.info("Clicked on Forgot Password");
		lp.clickforgotPassButton();
		ResetPasswordPage rp= new ResetPasswordPage(driver);
	    logger.info("Get text from Reset Password locator");
		String getText=rp.getText();
	    logger.info("Validated the test");
		Assert.assertEquals(getText, "Reset Password");


	}

}
