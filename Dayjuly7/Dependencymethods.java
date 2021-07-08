package Dayjuly7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencymethods {
   
	@Test(priority=1)
	void openURL()
	{
		System.out.println("URL opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2,dependsOnMethods={"openURL"})
	void LOGIN()
	{
		System.out.println("LOGIN Test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,dependsOnMethods={"LOGIN"})
	void Search()
	{
		System.out.println("Search test");
		Assert.assertTrue(false);
	}
	
	@Test(priority=4,dependsOnMethods={"LOGIN","Search"})
	void Advancedsearch()
	{
		System.out.println("Advanced search test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=5,dependsOnMethods={"LOGIN"})
	void Logout()
	{
		System.out.println("logout test");
		Assert.assertTrue(true);
	}
}
