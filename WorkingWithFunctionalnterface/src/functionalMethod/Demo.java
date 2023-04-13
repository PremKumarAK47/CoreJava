package functionalMethod;

public class Demo {
	
	public static void funX()
	{
		System.out.println("This in another way to use the function in which logic is written by double colon method");
		System.out.println("But it should be noted that method signature should be same ");
	}
	
	public static void main(String[] args) {
		
		Inter i1= ()-> System.out.println("Welcome To Lamda Expression");
		i1.sayHello();
		/*
		 * This is one way to call the function defined in the functional   interface
		 * but we can call the other method in which logic is written but it should
		 * also note that the function signature should be same like
		 * return type and no of passing argument.
		 * example given below
		 * if method defined is non static then make the object then use 
		 * but it should match with the method of interface
		 */
		
		Inter i2= Demo::funX;
		i2.sayHello();
		//System.out.println(i2);
		
		
	}

}
