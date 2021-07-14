package com.nopcommerence.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.nopcommerence.PageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		logger.info("URL is opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("user is provided");
		
		lp.setPassword(password);
		logger.info("password is provided");
		
		lp.clickLogin();

		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) 
		{
	      Assert.assertTrue(true);
	      lp.clickLogout();
	      logger.info("login passed");
		}
		
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login failed");
			
		}

	}

}
