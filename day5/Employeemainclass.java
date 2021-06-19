package day5;

public class Employeemainclass {
	public static void main(String[] args)
	  {
		  Employee emp1=new Employee(); //creating objects 
		  emp1.eid=101;
		  emp1.ename="AAAA";
		  emp1.sal=25000.00;
		  emp1.deptno=10;
		  emp1.job="engineer";
		  emp1.display();
		  
		  Employee emp2=new Employee(); //creating objects 
		  emp2.eid=102;
		  emp2.ename="BBBB";
		  emp2.sal=25000.00;
		  emp2.deptno=9;
		  emp2.job="engineer";
		  emp2.display();
		  
		  
		  
	  }

}
