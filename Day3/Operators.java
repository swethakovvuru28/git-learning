package Day3;

public class Operators {
	public static void main(String[] args) {
	
	int a=10;
	int b=20;
	
	//Arthematic operators\\
	System.out.println("--------Arthematic operators-----------");
	
	System.out.println("sum of a and b is:" +(a+b));
	System.out.println("diff of a and b is:" +(b-a));
	System.out.println("mul of a and b is:" +(a*b));
	System.out.println("div of a and b is:" +(a/b));
	System.out.println("mod div of a and b is:" +(a%b));
	
	//relational operators
	System.out.println("--------relational operators-----------");
	System.out.println(a==b);
	System.out.println(a<b);
	System.out.println(a>b);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a!=b);
	
	//logical operators
	System.out.println("--------logical operators-----------");
	
	boolean x=true;
	boolean y=false;
	
	System.out.println(x && y);
	System.out.println(x || y);
	System.out.println(!x);
	System.out.println(!y);
	
	//increment operators
	System.out.println("--------increment operators-----------");
	a=10;
	a++;    //a=a+1;
	System.out.println(a);
	
	b=20;
	  b--;     //b=b-1;
	  System.out.println(b);
	  
	
	
	}
}
