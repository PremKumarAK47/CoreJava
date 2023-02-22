package consForAbstract;

public class Demo {
	public static void main(String[] args) {
		Cars myCar = new Cars("Toyota", "Corolla", 2022, 4);
		System.out.println("Company-: "+myCar.getMake());
		System.out.println("Car Model-: "+myCar.getModel());
		System.out.println("Year of Making-: "+myCar.getYear());
		System.out.println("No. Of Doors:- "+myCar.numDoors);
		//System.out.println(myCar);
        myCar.start();
		
	}

}
