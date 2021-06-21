package Day5;

public class Constructoroverloading {
	
	Constructoroverloading(int a,int b)
	{
		System.out.println(a+b);
	}
	
	Constructoroverloading(int a,double b)
	{
		System.out.println(a+b);
	}

	Constructoroverloading(double a,int b)
	{
		System.out.println(a+b);
	}
	Constructoroverloading(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args)
    {
		Constructoroverloading co=new Constructoroverloading(10,20);  //first parameters
		Constructoroverloading co1=new Constructoroverloading(10,20.5); //second parameters
		Constructoroverloading co2=new Constructoroverloading(10.5,20); //third parameters
		Constructoroverloading co3=new Constructoroverloading(10,20,50);  //fourth parameters
	}
}
