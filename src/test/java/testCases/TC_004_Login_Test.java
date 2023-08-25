package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_004_Login_Test extends BaseClass
{
@Test(priority=0)
	
	public void test_login() throws InterruptedException
	{
	    logger.info("***  Starting Tc_004_Login_Test   ***");
		LoginPage lp= new LoginPage(driver);
	    logger.info("Entered invalid Email Id");
		lp.setEmail("vinay.shirke@pixis.aii");//invalid email id
	    logger.info("Enterted invalid password");
	    lp.setPassword("Vinay@1234");//invalid password
	    logger.info("Clicking on loggin button");
		lp.clickLoginButton();
	    logger.info("Getting title of Log in page");
		String title=lp.getTitle();
	    logger.info("Validated title");
        Assert.assertEquals(title, "Pixis AI Optimizer");
	    logger.info("***  Finish Tc_004_Login_Test   ***");

    }

}
