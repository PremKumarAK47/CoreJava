package functionMethodWithArgument;

public class Demo {
	
	public static void funX(String n)
	{
		System.out.println("Welcome to LE By Static  "+n);
	}
	
	public void funY(String n)
	{
		System.out.println("By NonStatic "+n);
	}
	
	public Demo() {
		// TODO Auto-generated constructor stub
	}
	public Demo(String n) {
		// TODO Auto-generated constructor stub
		System.out.println("By Constructor "+n);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InterParameter i1= Demo::funX;
		InterParameter i2= new Demo()::funY;
		InterParameter i3= Demo::new;
		i1.sayHello("Ranjeet");
		i2.sayHello("Ranjeet");
		i3.sayHello("Ranjeet");

	}

}
