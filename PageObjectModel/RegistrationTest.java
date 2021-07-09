package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {

	WebDriver driver;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	@Test
	void userRegistration()
	{
		RegistrationPage RGPage=new RegistrationPage(driver);
		RGPage.clickRegLink();
		RGPage.setFirstName("Pavan");
		RGPage.setLastName("kumar");
		RGPage.setPhone("8142402254");
		RGPage.setemail("pavan@gmail.com");
		RGPage.setAddress1("Hyderabad");
		RGPage.setAddress2("kukutpally");
		RGPage.setCity("HYDERABAD");
		RGPage.setState("Telengana");
		RGPage.setPostalCode("516360");
		RGPage.setCountry("INDIA");
		RGPage.setUserName("PAVAN");
		RGPage.setPassword("pavan");
		RGPage.setConfirmedPassword("pavan");
		RGPage.clickRegBtn();
		
		// Validation

		if (driver.getPageSource().contains("Thank you for registering")) {
					Assert.assertTrue(true);
		}

		else {
				Assert.fail();
			}
	}
	
}

