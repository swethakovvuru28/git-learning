package Day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylistdemo {
   public static void main(String[] args)
   {
	   //how to declare arraylist
	   ArrayList list=new ArrayList();  //we can store any type of element
	   
	   
	  // ArrayList <String> list=new ArrayList <String>();     //to store Strings
	   //ArrayList <Integer> list=new ArrayList <Integer>();to store Integer
	   
	   //add values to arraylist
	   list.add("John");     //0
	   list.add("Dravid");   //1
	   list.add("Scott");    //2
	   list.add("Smith");    //3
	   list.add(100);
	   list.add('A');
	   
	   //Size of arraylist
	   System.out.println(list.size());   //size=4
	   System.out.println("Before removing elements:" +list);
	   
	   
	   //remove an element
	   list.remove(2);    //remove scott
	   System.out.println(list.size());
	   System.out.println("After removing elements:" +list);
	   
	   //inserting a new element in a arraylist
	   list.add(1,"scott2");
	   System.out.println(list.size());
	   System.out.println("After removing elements:" +list);
	   
	   //read values from the arraylist using loop
	   for(Object s:list)
	   {
		   System.out.println(s);
	   }
	   
   }
}
