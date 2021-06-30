package Day30;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlewindow {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		
		//String handlevalue=driver.getWindowHandle();
		//System.out.println(handlevalue);     //CDwindow-64A1417B3D9FDDF1F37095FC54F67B7B
		
		
		driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button")).click();
		
		Set <String> handlevalue=driver.getWindowHandles();
		
		for(String h:handlevalue)
		{
			//System.out.println(h);
			String Title=driver.switchTo().window(h).getTitle();
			System.out.println(Title);
			
			if (Title.equals("Frames & windows") || Title.equals("SeleniumHq") )
			{
				driver.close();
			}
			
			
			
			
		}
		
		
		
		

     }
}