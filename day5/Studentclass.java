package day5;

public class Studentclass {
	int sid;
	String sname;
	char grade;
	
	Studentclass(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
	}
	
	void getvalues(int id,String name,char g)
	{
		sid=id;
		sname=name;
		grade=g;
    }
	
		
		void display()
		{
		System.out.println(sid+" "+sname+" "+grade);
		}
		
}
