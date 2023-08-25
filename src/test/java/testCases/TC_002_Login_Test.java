package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_002_Login_Test extends BaseClass
{
   @Test(priority=0)
	
	public void test_login() throws InterruptedException
	{
	try 
	{	
		logger.info("***  Starting Tc_002_Login_Test   ***");
		LoginPage lp= new LoginPage(driver);
		lp.setEmail("vinay.shirke@pixis.aii");//invalid email id
		logger.info("Entered the invalid password");
		lp.setPassword("Vinay@123");//valid password
		logger.info("Entering the valid password");
		lp.clickLoginButton();
 		logger.info("Clicked on loggin button");
     	String title=lp.getTitle();
		logger.info("Get title of login page");
		logger.info("Validated the title");
        Assert.assertEquals(title, "Pixis AI Optimizer");
		logger.info("***  Finished Tc_002_Login_Test   ***");

    }
	catch(Exception e)
	{
		logger.info("Test case failed");

		Assert.fail();
	}
}
}
