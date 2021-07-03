package Dayjuly3;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfileusingchrome {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		
		driver.manage().window().maximize();
		
		//download text file
		driver.findElement(By.id("textbox")).sendKeys("testing txt file download");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		Thread.sleep(5000);
		
	   if(isFileExist("C://newfile/info.txt"))
		{
			System.out.println("file exists");
		}
		else
		{
			System.out.println("file doesnt exists");  
		}
		
		
		//download pdf file
		driver.findElement(By.id("pdfbox")).sendKeys("testing pdf download");
		driver.findElement(By.id("createPdf")).click();
		driver.findElement(By.id("pdf-link-to-download")).click();
		
		Thread.sleep(5000);
		
   if(isFileExist("C://newfile/info.pdf"))
   {
		System.out.println("file exists");
	}
	else
	{
		System.out.println("file doesnt exists");  
	  } 
   }
   
   static boolean isFileExist(String path)
   {
	File f=new File(path);
	
	if(f.exists())
	{
		return true;
	}
	else
	{
		return false;
	}
}

}

