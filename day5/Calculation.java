package day5;

public class Calculation {
	
	int x=10;
	int y=20;
	
	
	/*void sum() //case-1
	{
		System.out.println(x+y);
		
	}*/
	
	
	int sum() //case-2
	{
           return(x+y);
		
	}
  public static void main(String[] args)
  {
	  Calculation cal=new Calculation();
	  /*cal.sum();*/
	  int res=cal.sum();
	  System.out.println(res);
	  System.out.println(cal.sum());

	  
  }
}
