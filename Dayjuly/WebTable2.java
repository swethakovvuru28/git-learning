package Dayjuly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
	
		//login
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		Thread.sleep(3000);
		
		//Admin-->Usermanagement-->Users
		
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewSystemUsers\"]")).click();
		
		//Table
		
		int rows=driver.findElements(By.xpath("//*[@id=\'resultTable\']/tbody/tr")).size();
		System.out.println(rows);
	}
}
		
		