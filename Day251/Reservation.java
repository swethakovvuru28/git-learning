package Day251;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*1. Open Browser
2. Open URL http://newtours.demoaut.com/
3. Enter username (mercury)
4. Enter password (mercury)
5. Click on Sign-in
6. Capture the title of the page
7. Validate Title of the page.
8. Expected Title: Find a Flight: Mercury Tours:*/

public class Reservation {

	public static class LoginTest {

		public static void main(String[] args)
		{
			//open web browser (chrome browser)
			
			System.setProperty("webdriver.chrome.driver", "C://Newdrivers//chromedriver_win32/chromedriver.exe");
			
			//ChromeDriver driver=new ChromeDriver();   //Launch the chrome browser
			
			WebDriver driver=new ChromeDriver();      //launch firefox browser

			//open url http://newtours.demoaut.com/
			
			driver.get("http://newtours.demoaut.com/");
			
			//Enter username (Admin)
			//WebElement Usernametxt=driver.findElement(By.id("txtUsername"));
			//Usernametxt.sendKeys("Admin");
			
			driver.findElement(By.id("txtUsername")).sendKeys("mercury");
			
			//enter password 
			driver.findElement(By.name("txtPassword")).sendKeys("mercury");
			
			//click login
			driver.findElement(By.name("Sign-in")).click();
			
			String act_title=driver.getTitle();
			String exp_title="Mercury Tours";
			
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
}

	
		
