package operationWithSuperKeyword;

public class Dog extends Animal {
	
	void displayDetails()
	{
		System.out.println("I am Dog..");
	}

	
	public static void main(String[] args) {
		Dog d1= new Dog();
		d1.displayDetails();
		d1.eat();
	}
}
