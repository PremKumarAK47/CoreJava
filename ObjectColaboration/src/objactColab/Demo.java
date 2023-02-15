package objactColab;

public class Demo {

	int x=100;
	//A a1= new A();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo d1= new Demo();
		A a1= new A();
		System.out.println(d1);
		System.out.println(a1);
		a1.funA();
		
		
		/*
		output will be
		objactColab.Demo@626b2d4a
        objactColab.A@cac736f
        for notepad class path should be same for both the class to execute properly
        here both will give the address of both the class
we have instantiated the non static member in static member that's why we are able to call the member of non static class
		
 */
	}

}
