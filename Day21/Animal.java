package Day21;

public class Animal {

	String color="white";
	
	void eating()
	{
		System.out.println("Eating........");
	}
	
	Animal()
	{
		System.out.println("Animal is created");
	}
	
}

class Dog extends Animal
{
	String color="Black";
	
	Dog()
	{
		super();//Invoked paraent class constructor
		System.out.println("Dog is created");
		
	}
	
	
	/*void displaycolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}*/
	
	/*void eating()
	{
		System.out.println("Eating Bread........");
		super.eating();
	}*/
}
