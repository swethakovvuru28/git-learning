package Day4;

public class Stringmethods {
           public static void main(String[] args)
           {
        	   String s="welcome";
        	   String s1="to java";
        	   
        	   System.out.println(s.length());        //length of string
        	   System.out.println(s.concat(s1));      //joining of string
        	   
        	   //triming a string 
        	   System.out.println("----------triming-------------");
        	   s="     welcome     ";
        	   System.out.println("before triming string is:" +s);
        	   
        	   System.out.println("after triming string is:" +s.trim());
        	   
        	  //charAt
        	   System.out.println("----------charAt-------------");
        	   s="welcome";
        	   System.out.println(s.charAt(3));
        	 //contains
        	   System.out.println("--------contains-----------");
        	   s="welcome";
        	   System.out.println(s.contains("wel"));
        	   System.out.println(s.contains("Wel"));
        	   System.out.println(s.contains("com"));
        	   
        	 //equals
        	   System.out.println("----------equals-------------");
        	   s="Welcome";
        	   
        	   System.out.println(s.equals("WElCOME"));
        	   System.out.println(s.equals("Wel   come"));
        	   System.out.println(s.equals("Welcome"));
        	   
        	   
        	   System.out.println("--------equalsIgnoreCase-------");
        	   
        	   System.out.println(s.equalsIgnoreCase("WElCOME"));
        	   
        	   //replacing characters
        	   System.out.println("------------replacing---------------");
        	   s="Welcome to java";
        	   //System.out.println(s.replace('e', 'a'));
        	   
        	   System.out.println(s.replace("java","selenium"));
        	   
        	   
        	  //substring
        	   System.out.println("---------------substring------------");
        	   s="welcome";
        	   System.out.println(s.substring(1,3));
        	   System.out.println(s.substring(0,4));
        	   System.out.println(s.substring(2,4));
        	   
        	   //converting cases
        	   s="WELCOME";
        	   System.out.println(s.toLowerCase());
        	   
        	   s="welcome";
        	   System.out.println(s.toUpperCase());
        	   { 
        		   
        	   }
        	   
           }
}

