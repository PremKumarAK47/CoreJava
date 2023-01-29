package genericsPractice;

public class GenericMethod<K> {
	
   public static <T> void fun1(T t) 
    {	
		System.out.println(t);
	}
public static <K,V> void fun2(K k,V v)
{
	System.out.println(k+" ============ "+v);
}
//We can add some return type as  Well
public static <K,V> V fun3(K k,V v)
{
	System.out.println(k+" ============ "+v);
	//according to return type it will return the values.
	return v;
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		fun1(0);
		fun2(10,0);
		fun1("Hello");
		fun2(20,"Hello");
		
		fun2(30,new Student(10, "n1", 500));
		fun1(new Student(10, "n1", 500));

	}

}
