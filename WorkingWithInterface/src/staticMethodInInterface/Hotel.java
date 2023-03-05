package staticMethodInInterface;

public interface Hotel {
	
   public void chickenBiryani();
	
	public void masalaDosa();
	
	public default void iceCream() {
		/*
		 * -- we can define a default method with the body inside an interface.

--this default method need not override inside the implementation classes.

--if we want , we can override this default method inside any implementation classes.

--these default method are by default inherited inside the implementation classes.

--we can call these default method from any implementation class object.
		 */
		
		System.out.println("iceCream from Hotel");
	}
	
  public static void drinkingWater() {
		/*
		 * **Note: we can call the static method of an interface only by using Interface name.
we can not call static method of an interface even by using interface variable also.
		 */
		System.out.println("drinking water from Hotel");
	}
	
}
