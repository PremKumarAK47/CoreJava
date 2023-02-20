package operationWithSuperKeyword;

public class Dog extends Animal {
	
	
	
	@Override
	void eat()
	{
		System.out.println("Dog is Eating...");
		
	}
	void displayDetails()
	{
		System.out.println("I am Dog..");
		super.eat();
		/*
		 * here by super keyword we can call the original object of immediate parent 
		 * class even we have overridden the method still we can get the original
		 * method of parent class with body,
		 * 
		 */
	}
	
	
	

	
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.displayDetails();
		//d1.eat();
		//d1.super.eat(); Cannot use super in static area.
		
		//Runtime Polymorphism or Dynamic Polymorphism
		//Super class Reference and Child class object
		
		Animal a1= new Dog();
		a1.eat();// it will give the priority to overridden method.,
		
		Dog d= (Dog) a1;
	}
}
