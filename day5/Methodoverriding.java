package Day5;

class Bank
{
	double rateofIntrest()
	{
		return 0;
	}
}

class SBI extends Bank
{
	double rateofIntrest()
	{
		return 10.5;
	}
}

class ICICI extends Bank
{
	double rateofIntrest()
	{
		return 9.7;
	}
}

class Axis extends Bank
{
	double rateofIntrest()
	{
		return 8.5;
	}
}

public class Methodoverriding {
	
	public static void main(String[] args)
	{
		SBI sbi=new SBI();
		System.out.println(sbi.rateofIntrest());
		
		ICICI icici=new ICICI();
		System.out.println(icici.rateofIntrest());
		
		Axis axis=new Axis();
		System.out.println(axis.rateofIntrest());
		
	}
	
	
   }
