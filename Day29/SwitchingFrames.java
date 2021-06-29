package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingFrames 
{
	public static void main(String[] args)
	{
		
        System.setProperty("webdriver.chrome.driver", "C://Newdrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();   //maximize the window
		
		driver.switchTo().frame("Package List Frame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();    //1 frame
		
		driver.switchTo().defaultContent();   //go back to the page
		
		driver.switchTo().frame("Package List Frame");
		driver.findElement(By.linkText("WebDriver")).click();      //2 frame
		
		
		driver.switchTo().defaultContent(); 
		
		driver.switchTo().frame("Package List Frame");
		driver.findElement(By.linkText("/html/body/main/div[1]/h1")).click();  //3 frame
		
		
	}
   }
