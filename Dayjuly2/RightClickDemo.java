package Dayjuly2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
		act.contextClick(button).build().perform(); //right click on button
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
		Alert alert=driver.switchTo().alert();
		
		System.out.println("Text present on alert window:" +alert.getText());
		alert.accept();//this closes the alert window
		
		 }
  }