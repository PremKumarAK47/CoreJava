package bankSystem;

public class Demo {

	public static void main(String[] args) {
		
		
		Bank b1= new SBI();
		Bank b2=new PNB();
		Bank b3= new ICICI();
		System.out.println("Rate of Interest of SBI is: "+b1.getRateOfInterest()+" %");
		System.out.println("Rate of Interest of PNB is: "+b2.getRateOfInterest()+" %");
		System.out.println("Rate of Interest of ICICI is: "+b3.getRateOfInterest()+" %");
     
		/*
		 * Here if you notice that there is a relationship stabilized is called
		 * Parent class reference and child class object
		 * By this we can call all the  method of parent class or the method which 
		 * are overridden in the child class.
		 * If we want to call the child's specific method then we need to downcast the
		 * child class object and hold into the child class variable
		 * then we can call,
		 */
		
		
	}

}
