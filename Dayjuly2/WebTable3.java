package Dayjuly2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable3 {
	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver","C://Newdrivers//test/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.seleniumeasy.com/test/table-pagination-demo.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement Paging_Element=driver.findElement(By.xpath("//*[@id=\"myPager\"]"));
		List <WebElement> sub_link=Paging_Element.findElements(By.tagName("a"));
		
		System.out.println("Total number of page links:"+sub_link.size());
		
		if(sub_link.size()>0)
		{
			System.out.println("Links are present");
			
			for(int i=1;i<sub_link.size()-1;i++)
			{
			WebElement link=driver.findElement(By.xpath("//a[contains(text(),'"+i+"')]"));
			link.click();
				
		int rows=driver.findElements(By.xpath("//*[@id=\"myTable\"]/tr")).size();
		for(int r=1;r<=rows;r++)
		{
			
			String col1=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[1]")).getText();
			String col2=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[2]")).getText();
			String col3=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[3]")).getText();
			String col4=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[4]")).getText();
			String col5=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[5]")).getText();
			String col6=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[6]")).getText();
			String col7=driver.findElement(By.xpath("//*[@id=\"myTable\"]/tr["+r+"]/td[7]")).getText();
			
			System.out.println(col1+"  "+col2+"  "+col3+"  "+col4+"  "+col5+"  "+col6+"  "+col7);
		    }
				
		}
	}
		else
		{
			System.out.println("links not present in the paging element");
		}
		
		
		
		}
}