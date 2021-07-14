package com.nopcommerence.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.nopcommerence.PageObjects.LoginPage;
import com.nopcommerence.Utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass
{
	
	@Test(dataProvider="userdata")
	public void loginTest(String user, String pwd) throws InterruptedException, IOException {
		
		driver.get(baseURL);
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(driver);
				
		lp.setUserName(user);
		logger.info("User provided"); //logger msg
		
		lp.setPassword(pwd);
		logger.info("Password provided");//logger msg
		
		lp.clickLogin();
		logger.info("Login in Clicked");//logger msg
		
		Thread.sleep(2000);
		
		if (driver.getTitle().equals("Dashboard / nopCommerce administration")) 
		{
			lp.clickLogout();
			Assert.assertTrue(true);
					
		} 
		else
		{
			logger.info("Login Failed");//logger msg
			Assert.assertTrue(false);
		}

	}
		
	
	@DataProvider(name="userdata")
	public String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/nopcommerence/testdata/userdata.xlsx";
		
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path,"Sheet1",1);
		
		String userdata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				userdata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i,j);
			}
		}
		
		return userdata;
		
	}
	
	
}

