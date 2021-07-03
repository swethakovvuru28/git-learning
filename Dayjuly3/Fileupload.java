package Dayjuly3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Fileupload {
	public static void main(String[] args) throws InterruptedException, FindFailed  
	{
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
    	WebDriver driver=new ChromeDriver(); 
    driver.get("http://demo.automationtesting.in/Register.html");
    driver.manage().window().maximize();
    
    driver.findElement(By.xpath("//*[@id='imagesrc']")).click();
    
    String imagesFilepath="C:\\screenshots\\Images";
    String inputFilepath="C:\\screenshots\\Images";
    
    Screen s=new Screen();
    Pattern fileInputTextbox=new Pattern(imagesFilepath+"Filebox.PNG");
    Pattern openbutton=new Pattern(imagesFilepath+"Open.PNG"); 
    
    Thread.sleep(5000);
    
    s.wait(fileInputTextbox, 20);
    s.type(fileInputTextbox,inputFilepath+"Apple.PNG.jpg");	
    s.click(openbutton);
    	
    }
}