package answer2;

public class Demo {
	Demo(){
		this(10);
		System.out.println("inside Demo()....");
	}
	
	Demo(int i){
		this("hello");
		System.out.println("inside Demo(int )....");
		System.out.println(i);
	}
	
	Demo(String s){
		this(5.75f);
		System.out.println("inside Demo(String )....");
		System.out.println(s);
	}
	Demo(float f)
	{
		System.out.println("Inside Demo(Float)....");
		System.out.println(f);
	}

	
		
	
	public static void main(String[] args) {

		Demo d1=new Demo();

	}

}
