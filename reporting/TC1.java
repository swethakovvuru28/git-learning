package reporting;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC1 {

	@Test
	void m1()
	{
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods={"m1"})
	void m2()
	{
		
		Assert.assertTrue(true);
	}
	
	
	@BeforeTest
	void mm()
	{
		Assert.assertTrue(true);
	}
}
