package genericsPractice;

public class GenericMethod {
	
   public static <T> void fun1(T t) 
    {	
		System.out.println(t);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		fun1(0);
		fun1("Hello");
		
		fun1(new Student(10, "n1", 500));

	}

}
