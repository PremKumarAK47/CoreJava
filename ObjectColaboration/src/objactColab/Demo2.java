package objactColab;

public class Demo2 {
	/*
	 * here we will learn about methods
	 * methods are the 
	 * methods are two type 
	 * parameterized non parameterized
	 * static or non static
	 * 
	 */
     void funA()
     {
    	 System.out.println("method Declaration");
    	 System.out.println("This is non Static Method ");
    	 System.out.println("We can not get access this method wo creating object of the Demo1 class");
     }
     static void funB()
     {
    	 System.out.println("We call it directly wo creating object of the class");
         System.out.println("This is static Method");     
     
     }
     
     static void funC(int x)
     {
    	 System.out.println("inside FunC of Demo1 "+ x);
     }
     static void funD(A a1)
     {
    	 System.out.println("This is for parameterized constructer for Passing refernce variable ");
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=100;
		funC(x);
		funB();
	}

}
