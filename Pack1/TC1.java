package Pack1;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class TC1 {

		@Test
		void m1()
		{
			System.out.println("this is m1 from Testcase1");
		}
		
		@Test
		void m2()
		{
			System.out.println("this is m2 from testcase1");
		}
		
		
		@BeforeTest
		void mm()
		{
			System.out.println("this is mm");
		}
	}

