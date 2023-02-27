package answer4;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car Model : Harrier
//		Car companyName : Tata
//		Car color : black
//		Car RPM : 10000
//		Car power : 110
//		Car Engine Manufacture : tata
//		Car Has Turbo : true
		Car c1= new Car();
		 c1.setModel("Harrier");
		 c1.setCompanyName("Tata");
		 c1.setColor("Black");
		 c1.setEngine(new Engine(10000, 110, "tata", true));
		
		 
		 System.out.println("Car Model :"+c1.getModel());
		 System.out.println("Car CompanyName :"+c1.getCompanyName());
		 System.out.println("Car Color :"+c1.getColor());
		 System.out.println("Car RPM :"+c1.getEngine().getRmp());
		 System.out.println("Car Power :"+c1.getEngine().getPower());
		 System.out.println("Car Engine Manufacturer :"+c1.getEngine().getManufacturer());
		 System.out.println("Car Has Turbo :"+c1.getEngine().isTurboEngine(false));
		 
		 
		 
		

	}

}
