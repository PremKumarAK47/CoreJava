package objactColab;

public class Demo {

	int x=100;
	int y;
	A a1= new A(); 
	A a2;
	/*
	 *  Has a relationship when we create another class object in another one then it is Has a Relationship by extend keyword we ensure the is a Relationship
	 *  we can define a class as a instance member of another class by this
	 *  we establish has a relationship between two objects
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1= new Demo();
		
		
		System.out.println(d1.x);
		System.out.println(d1.a1);
		System.out.println(d1.y);
		d1.a1.funA();
		d1.a2.funA();
		/* Here this will give NUll pointer exception cause as a default value of a2 will be null, cause we have defined but not the initialize
		//so any object holding null value and we are trying to access any value from that then null pointer exception will occur,
		 * default value will be given by compiler for defined variables which 
		 * which are not initialize
		 */
		
		/*
		 * System.out.println(x);
		   System.out.println(a1);
		 *  
		 *  non static member are not accessible in this static area for   accessibility we have to make the object of Demo class in main method 
		*/
		
		/*
		Demo d1= new Demo();
		A a1= new A();
		System.out.println(d1);
		System.out.println(a1);
		a1.funA();
		
		
		
		output will be
		objactColab.Demo@626b2d4a
        objactColab.A@cac736f
        for notepad class path should be same for both the class to execute             properly
        here objects created locally 
        
        here both will give the address of both the class
we have instantiated the non static member in static member that's why we are able to call the member of non static class
		
 */
	}

}
