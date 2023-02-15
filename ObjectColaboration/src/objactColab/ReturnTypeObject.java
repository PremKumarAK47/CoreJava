package objactColab;

public class ReturnTypeObject {
	
	static A ObjectReturn()
	{
		System.out.println("This one is return type of Class so here we can Return");
		System.out.println("Three Possible values");
		System.out.println("1. It's own object");
		System.out.println("2. It's Child Class Object");
		System.out.println("3. Default Null value");
		System.out.println("We should hold it in it's Object type Variable");
		
		A a1= new A();
		return a1;
		
				//return null;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Object obj = ObjectReturn();
		A a2= ObjectReturn();
		a2.funA();
		System.out.println(obj);
		
		
	}

}
