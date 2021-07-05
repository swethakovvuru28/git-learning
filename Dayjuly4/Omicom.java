package Dayjuly4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Omicom {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://auth-gcpside-cfw-c8.manh-dev.com/org_login");
		
        driver.manage().window().maximize();
		
        //login
		
		driver.findElement(By.id("login-username")).sendKeys("systemadmin@system.com");
		driver.findElement(By.id("login-password")).sendKeys("pU5hP@55iB13");
		driver.findElement(By.id("login-submit")).click();
		

		//Admin-->Usermanagement-->Users
		
		driver.findElement(By.xpath("//*[@id=\"login-username\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-password\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		
		
	}

}
