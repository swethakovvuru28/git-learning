package Dayjuly5;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHashmap {
	static HashMap <String,String> logindata()
	{
		HashMap <String,String> hm=new HashMap<String,String>();
		
		hm.put("x", "mercury@mercury");
		hm.put("y", "mercury1@mercury1");
		hm.put("z", "mercury2@mercury2");
		
		return hm;
	}
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/newtours/index.php");
		
		String credentials=logindata().get("y");
		
		String uarr[]=credentials.split("@"); // splitting
		
		driver.findElement(By.name("userName")).sendKeys(uarr[0]);
		driver.findElement(By.name("password")).sendKeys(uarr[1]);
		driver.findElement(By.name("submit")).click();
		
		if (driver.getTitle().equals("Find a Flight: Mercury Tours:")) {
			System.out.println("Test Passed");

		} else {
			System.out.println("Test failed");

		}
		
		driver.findElement(By.linkText("Home")).click();
		
	}
	}
