package Day21;

class A1
{
	void m1()
	{
		System.out.println("this is m1 method from A1 class");
	}
}

interface B1
{
	default void m2()
	{
		
	}
}
interface B2
{
	default void m3()
	{
		
	}
}
public class Hybridinheritance extends A1 implements B1,B2 
{
	public void m2()
	{
		System.out.println("this m2 method from B1 interface");
	}
	
	public void m3()
	{
		System.out.println("this m3 method from B2 interface");
	}
	
	public static void main(String[] args)
    {
		Hybridinheritance mi=new Hybridinheritance();
		mi.m1();
		mi.m2();
		mi.m3();
    }
}

