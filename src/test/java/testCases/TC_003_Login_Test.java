package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_003_Login_Test extends BaseClass
{
@Test(priority=0)
	
	public void test_login() throws InterruptedException
	{ 
	    logger.info("***  Starting Tc_003_Login_Test   ***");
		LoginPage lp= new LoginPage(driver);
		logger.info("Entered valid password");
		lp.setEmail("vinay.shirke@pixis.ai");//valid email id
		logger.info("Entered invalid password");
		lp.setPassword("Vinay@123");//invalid password
		logger.info("Clicked on Login Button");
		lp.clickLoginButton() ;
		logger.info("Get Login page title");
		String title=lp.getTitle();
		System.out.println(title);
		logger.info("Validated title of Login Page");
        Assert.assertEquals(title, "Pixis AI Optimizer");
		logger.info("***  Finished Tc_002_Login_Test   ***");

    }

}
