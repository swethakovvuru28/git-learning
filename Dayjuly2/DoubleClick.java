package Dayjuly2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
        Thread.sleep(3000);
        
        WebElement button=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
        Actions act=new Actions(driver);  //double click
        
        }
}