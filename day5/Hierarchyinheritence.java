package Day5;

class parent
{
	int a;
	void display()
	{
		System.out.println(a);
	}
}

class child1 extends parent
{
	int x;
	void show()
	{
		System.out.println(x);
	}
}

class child2 extends parent
{
	int y;
	void print()
	{
		System.out.println(y);
	}
}

/*class child3 extends parent
{
	int z;
	void display()
	{
		System.out.println(z);
	}
}*/

public class Hierarchyinheritence {
	public static void main(String[] args)
	{
		child1 c1=new child1();
		c1.a=100;
		c1.x=200;
		c1.display();
		c1.show();
		
		
		child2 c2=new child2();
		c2.a=10;
		c2.y=20;
		c2.display();
		c2.print();
	}

}
