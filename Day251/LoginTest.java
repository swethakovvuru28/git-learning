package Day251;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1Open Web Browser.
2. Open URL http://opensource.demo.orangehrmlive.com
3. Enter username (Admin).
4. Enter password (admin).
5. Click on Login.
6. Capture title of the home page.
7. Verify title of the page: OrangeHRM
*/

public class LoginTest {

	public static void main(String[] args)
	{
		//open web browser (chrome browser)
		
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//chromedriver_win32/chromedriver.exe");
		
		//ChromeDriver driver=new ChromeDriver();   //Launch the chrome browser
		
		WebDriver driver=new ChromeDriver();      //launch firefox browser

		//open url http://opensource.demo.orangehrmlive.com
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Enter username (Admin)
		//WebElement Usernametxt=driver.findElement(By.id("txtUsername"));
		//Usernametxt.sendKeys("Admin");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		//enter password 
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		//click login
		driver.findElement(By.name("submit")).click();
		
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		//verify the title page of OrangeHRM
		
		if(act_title.equals(exp_title))
		{
			System.out.println("test passed");
		}
		else
		{
			
		System.out.print("test failed");
		}
		
		driver.close();  //driver.quit();
		
		}
}
