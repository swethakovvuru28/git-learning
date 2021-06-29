 package Day29;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingLinks {

	  	public static void main(String[] args) 
	  	{
	  		
	  		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//chromedriver_win32/chromedriver.exe");
	  		WebDriver driver=new ChromeDriver();
	  		
	  		driver.get("http://demo.guru99.com/test/newtours/");
	  		
	  		//driver.manage().window().maximize();   //maximize the page
	  		List<WebElement>links=driver.findElements(By.tagName("a"));
	  		
	  		 System.out.println(links.size());
	  		//reading all links from web page and display
	  		for(WebElement e:links)
	  		 {
	  			 System.out.println(e.getText());
	  		 }
	  		

	   }

		
}
