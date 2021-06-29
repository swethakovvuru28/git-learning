package Day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsDemo {
   public static void main(String[] args) throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "C://Newdrivers//chromedriver_win32/chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		
 		driver.get("https://testautomationpractice.blogspot.com/");
 		

		driver.manage().window().maximize(); // Maximize your browser/page
		driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button")).click();    //click me button
		
		Thread.sleep(5000);
		
		//driver.switchTo().alert().accept();   //close popup by using ok button
		driver.switchTo().alert().dismiss();   //close popup by using ok button
 		
 		
 		
 		
 		
 		
   }
   
 }