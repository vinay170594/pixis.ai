package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import pageObject.HomePageDashboard;
import pageObject.LoginPage;
import testBase.BaseClass;

public class TC_001_Login_Test extends BaseClass
{
	@Test(priority=0)
	
	public void test_login() throws InterruptedException
	{
		try
		{
		logger.info("***  Starting Tc_001_Login_Test   ***");
		LoginPage lp= new LoginPage(driver);
		//lp.setEmail(rb.getString("email"));
		lp.setEmail("vinay.shirke@pixis.ai");
		logger.info("Enteed valid email address");
		//lp.setPassword(rb.getString("password"));
		lp.setPassword("Vinay@123");
		logger.info("Entered valid password");
      	lp.clickLoginButton();
		logger.info("Clicked on Log In Button");
        HomePageDashboard hp=new HomePageDashboard(driver);
		hp.pixisLogoClick();
		logger.info("Clicked on Home page PIxis Logo");
        String title=lp.getTitle();
		logger.info("Get title name of Pixis Home Page");

//		System.out.println(title);

//		WebDriverWait mywaits= new WebDriverWait(driver,Duration.ofSeconds(20));
//		mywaits.until(ExpectedConditions.elementToBeClickable(By.id("btn-login")));
//		String title=lp.getTitle();
//		System.out.println(title);
		logger.info("Validated expected title");
		Assert.assertEquals(title, "Pixis AIi","Not getting expected title");
		}
		catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		
		logger.info("***  Finish Tc_001_Login_Test   ***");

		
		
    }

}
