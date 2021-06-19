package Day4;

public class Arrays {

	public static void main(String[] args) {
	
		//int a[]=new int[5]; // declared array with size 5, starting index is 0, last index is 4
		
		//storing/inserting values into array
		/*a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		int a[]={100,200,300,400,500}; //Declare an array without specifying size
		
		System.out.println("Length of an array is:" +a.length); // prints length/size of an array
		
		System.out.println("-------------read values----------");
		
		System.out.println(a[2]); // read specific value
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]); //100 200 300 400 500
		}*/
		
		//read values using enhanced for loop
		System.out.println("-----------enhanced for loop-----------");
		
		for(int i:a)
		{
			System.out.println(i); //100 200 300 400 500
		}
		
		
	}

}

