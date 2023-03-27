package functionalInterfaceExamp;
@FunctionalInterface
public interface FunctionalInterfacaeOne {
	
	void sayHello(String name);
	
	static void staticFun(String def)
	{
		System.out.println("Functional Interface can have n number of Default and static fun");
	}

	
	default void defaultFun()
	{
		System.out.println("Functional Interface can have n No. of default Fun");
	}
}
