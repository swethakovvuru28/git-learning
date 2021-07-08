package testnglisteners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	void setup() //true
	{
		Assert.assertTrue(true);
	}
	
	@Test //pass
	void loginByEmail()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"setup"})  //skipped
	void loginByFacebook()
	{
		Assert.assertTrue(true);
	}
}
