package Day5;

public class Staticexample {
	
     static int a=10;          //static variable 
     int b=20;           //non static variable
     
     
     static void m1()
     {
    	 System.out.println("this is m1 - static method");
     }
     void m2()
     {
    	 System.out.println("this is m2 - nonstatic method");
     }
     
     void m3()
     {
    	 System.out.println("this is m3 method-----nonstatic");
    	 System.out.println(a);
    	 System.out.println(b);
    	 m1();
    	 m2();
     }
     
      public static void main(String[] args)
	     {
		    //static method can only access static stuff
    	   System.out.println(Staticexample.a);
    	   Staticexample.m1();
    	   
    	/*System.out.println(m1);
    	   m1();*/
    	   
    	 //static method can also access  non static stuff but through object
    	   Staticexample se=new Staticexample();
    	   System.out.println(se.b);     //non static variable
    	   se.m2();    //non static method through object
    	   
    	   se.m3();
	}

}
