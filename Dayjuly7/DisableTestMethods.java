package Dayjuly7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTestMethods {
   
	@Test(priority=1)
	void openURL()
	{
		System.out.println("URL opened");
		Assert.assertTrue(true);
	}
	
	@Test(priority=2)
	void LOGIN()
	{
		System.out.println("LOGIN Test");
		Assert.assertTrue(true);
	}
	
	@Test(priority=3,enabled=false)
	void Search()
	{
		System.out.println("Still in progress------------------");
	}
	
	@Test(priority=4,enabled=false)
	void Advancedsearch()
	{
		System.out.println("Still in progress------------------");
	}
	
	@Test(priority=5)
	void Logout()
	{
		System.out.println("logout test");
		Assert.assertTrue(true);
	}
}
