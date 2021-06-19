package Day3;

public class Whileloop {
	public static void main(String[] args)
	{
		int i=1;
	while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	
	//even numbers from 1 to 10
System.out.println("--------even numbers--------");
i=2;
		
while(i<=10)
{
	System.out.println(i);
	i+=2;   //i=i+2;
}


//print 1 to 10 in descending order
System.out.println("--------descending numbers--------");

i=10;

while(i>0)
{
	System.out.println(i);
	i--;  //i=i-2;
	
}

}
}