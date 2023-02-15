package objactColab;

public class ReturnTypeMethod {
	/*
	 * In this we will learn about the return type method
	 * in return Type Method we should return the proper return type value
	 */
	
	static int funA(int x)
	{
		System.out.println("This one is the Return type of Fun here we should return Some Value according to return type");
		System.out.println("and We have to hold the proper value inside a typed  variable ");
return 10;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x=10;
		
		int result = funA(x);
		System.out.println(result);
		
	}

}
