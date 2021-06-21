package Day5;

public class Overloadmainmethod {
	
	public void main(int x)      //1
	{
		System.out.println(x);
		
	}
  
	public void main(int x,int y)    //2
	{
		System.out.println(x+y);
		
	}
	
	public static void main(String[] args) {
		
		Overloadmainmethod om=new Overloadmainmethod();
		om.main(100);  //1
		om.main(100,200); //2
		
		
		
		}
}
