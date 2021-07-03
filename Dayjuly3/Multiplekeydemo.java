package Dayjuly3;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiplekeydemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://newtours.demoaut.com/");

		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.CONTROL+"a").build().perform();

	}

}
