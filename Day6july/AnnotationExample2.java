package Day6july;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample2 {


@BeforeClass
void login()
{
System.out.println("this is login");	
}
		
@AfterClass
void logout()
{
System.out.println("this is logout");	
}
		
@Test(priority=1)
void search()
{
System.out.println("this is search");	
}
		
@Test(priority=2)
void advsearch()
{
System.out.println("this is adv search");	
}
		
@Test(priority=3)
void recharge()
{
System.out.println("this is recharge");	
}
		
}
