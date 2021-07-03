package Dayjuly3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sliderdemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		act.moveToElement(slider).dragAndDropBy(slider,400, 0).build().perform(); //moving the slider

	}

}
