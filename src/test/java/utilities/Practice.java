package utilities;

import java.time.Duration;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Practice
{
	    public static WebDriver driver;
	     
	    public Logger logger;
	    
	    public ResourceBundle rb;
		@BeforeClass
		public void setup()
		{
			System.setProperty("webdriver.chrome.driver","F:\\selenium\\chromedriver_win32\\chromedriver.exe");
	        ChromeOptions co=new ChromeOptions();
	        co.addArguments("--remote-allow-origins=*");
	        driver= new ChromeDriver(co);
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        //ResourceBundle.getBundle("config");// Load config.properties file
            //driver.get(rb.getString("loginPageURL"));
	        driver.get("https://auth-qa.pixis.ai/login?state=hKFo2SBXREktblhYQWh1YnBocnpVT2M5UGZ4T212RW9ndWRnb6FupWxvZ2luo3RpZNkgU0RhXzFhWGFxWlVTbHQtcHUxemJiVFlkWDhPWWw1bU6jY2lk2SBYU1NTZ1pycjRuTUIyYmFsYkh5SlpnQ3BQOHUxdGM3MA&client=XSSSgZrr4nMB2balbHyJZgCpP8u1tc70&protocol=oauth2&scope=openid%20profile%20email%20offline_access&audience=https%3A%2F%2Fcross-platform-qa.us.auth0.com%2Fapi%2Fv2%2F&location=%5Bobject%20Object%5D&computedMatch=%5Bobject%20Object%5D&redirect_uri=https%3A%2F%2Fapp-qa.pixis.ai%2Flogin%2Fsuccessfull&response_type=code&response_mode=query&nonce=NTJiUWFqR0NJVkFURldDQm1uWjZ1OVB2dVBxX2hOcW9YRElBLUxuejBaVQ%3D%3D&code_challenge=01TeMYfYtk0kAx13p-bWGGs-QiuU0CybWssEbHUugHg&code_challenge_method=S256&auth0Client=eyJuYW1lIjoiYXV0aDAtcmVhY3QiLCJ2ZXJzaW9uIjoiMS4xMi4xIn0%3D\r\n");
            driver.manage().window().maximize();
			logger = LogManager.getLogger(this.getClass());

		}
		
		
		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
		public String randomeString() {
			String generatedString = RandomStringUtils.randomAlphabetic(5);//length of string upto 5
			return (generatedString);
		}

		public String randomeNumber() {
			String generatedString2 = RandomStringUtils.randomNumeric(10);//10 digit number
			return (generatedString2);
		}
		
		public String randomAlphaNumeric() {
			String st = RandomStringUtils.randomAlphabetic(4);
			String num = RandomStringUtils.randomNumeric(3);
			
			return (st+"@"+num);
		}

	

}
