package Day22;

public class FinalBlock {

	public static void main(String[] args) {
	
		System.out.println("Program started");
		
		
		int a=100;
		
		try
		{
		System.out.println(a/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("ENTERED IN TO cATCH BLOCK");
		}
		finally
		{
			System.out.println("ENTERED INTO FINALLY BLOCK");
		}
		
		System.out.println("Program exited");
	}

}
