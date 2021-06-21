package Day5;

public class Constructordemo {
	
	int x;
	int y;
	
	Constructordemo()     //default constructor
	{
		x=10;
		y=20;
		
	}
	

	Constructordemo(int a ,int b)     //parameterized constructor
	{
		x=a;
		y=b;
		
	}
	
	void display()
	{
		System.out.println(x+y);
	}
	
	public static void main(String[] args)
	{
		Constructordemo cm1=new Constructordemo();     //invoke default constructor
		Constructordemo cm2=new Constructordemo(100,200);   //invoke parameterized constructor
		cm1.display();
		cm2.display();
		
	}

}
