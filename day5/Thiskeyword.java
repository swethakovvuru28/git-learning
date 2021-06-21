package Day5;

public class Thiskeyword {
      int a,b;                //class variables
      
      void getvalues(int x,int y)     //method variables
      {
    	  a=10;
    	  b=20;
    }
      void printvalues()
      {
    	  System.out.println(a);
    	  System.out.println(b);
    	  
      }
      
     public static void main(String[] args) 
     {
    	 Thiskeyword th=new Thiskeyword();
    	 th.getvalues(10,20);
    	 th.printvalues();
     }
      
      
      
      
}
