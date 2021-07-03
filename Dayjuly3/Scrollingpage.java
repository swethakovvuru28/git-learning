package Dayjuly3;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingpage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		
		//Create JavascriptExecor variable
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Approach1 - number of pixels
			//	js.executeScript("window.scrollBy(0,2000)","");
		
		//Approach2 - till we found certain element on the web page
		
			//WebElement flag=driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/table[1]/tbody/tr[86]/td[1]/img"));
			//js.executeScript("arguments[0].scrollIntoView();",flag);
		
		//Appraoch3 - till end of the page
		
			js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
