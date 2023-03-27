package functionalInterfaceExamp;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using a external or separate class
				FunctionalInterfacaeOne i1= new FunctinalImpl();
				i1.sayHello("Prem");
				
				//using Anonymous inner class
				//we can use Anonymous inner class without a FI also
				FunctionalInterfacaeOne i2= new FunctionalInterfacaeOne() {

					@Override
					public void sayHello(String name) {
						System.out.println("Welcome using Annonymous inner class" +name);
						
					}
					
				};
				
				i2.sayHello("Amit");
				
				
				//using Lambda expression:
				
				FunctionalInterfacaeOne i3= name -> System.out.println("Welcome Using LE "+name);
				
				i3.sayHello("Ram");
				

	}

}
