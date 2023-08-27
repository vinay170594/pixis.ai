package testCases;

import testBase.BaseClass;
import utilities.DataProviders;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageDashboard;
import pageObject.LoginPage;


public class TC_006_LoginDDT_Test extends BaseClass
{
    @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
                                   //additional steps if data provider in separate class
    public void test_loginDDT(String email, String password, String exp)
    {
    	try
    	{
		logger.info("***  Starting Tc_006_Login_Test   ***");
		LoginPage lp= new LoginPage(driver);
		//lp.setEmail(rb.getString("email"));
		logger.info("Enterd valid email address");
		lp.setEmail(email);
		//lp.setPassword(rb.getString("password"));
		lp.setPassword(password);
		logger.info("Entered valid password");
      	lp.clickLoginButton();
		logger.info("Clicked on Log In Button");
        HomePageDashboard hp=new HomePageDashboard(driver);
		hp.pixisLogoClick();
		logger.info("Clicked on Home page PIxis Logo");
		boolean targetPage=hp.isHomePageTitle();
		if(exp.equals("Valid"))
		{
			if(targetPage==true)
			{ 
				//hp.clickLogout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equals("Invalid"))
		{
			if(targetPage==true)
			{ 
				//hp.clickLogout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
    	}
    	catch(Exception e)
    	{
    		Assert.fail();
    	}

		
		logger.info("***  Finish Tc_006_Login_Test   ***");
    
}
}

