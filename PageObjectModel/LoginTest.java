package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class LoginTest {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/index.php");
	}
	
	void login()
	{
		LoginPage lp=new LoginPage(driver);
		lp.setUserName("mercury");
		lp.setPassword("mercury");
		lp.clickSubmit();
	}
}
