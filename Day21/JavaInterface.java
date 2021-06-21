package Day21;

interface A
{
	int a=10;    //by default variables are static and final
	default void m1()    //abstaract method by default public
	{
		
	}
}

public class JavaInterface implements A
{
	public void m1()
	{
		System.out.println(a);
		
	}
	
	public static void main(String[] args)
	{
		/*JavaInterface ji=new JavaInterface();
		ji.m1();*/
		
		
		A a=new JavaInterface();
		a.m1();
	}

}
