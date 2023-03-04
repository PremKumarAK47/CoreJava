package bankSystem;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1= new SBI();
		Bank b2=new PNB();
		Bank b3= new ICICI();
		System.out.println("Rate of Interest of SBI is: "+b1.getRateOfInterest()+" %");
		System.out.println("Rate of Interest of PNB is: "+b2.getRateOfInterest()+" %");
		System.out.println("Rate of Interest of ICICI is: "+b3.getRateOfInterest()+" %");

	}

}
