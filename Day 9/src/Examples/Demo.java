package Examples;

public class Demo extends A {
	int x=100;
	void funX()
	{
		System.out.println("Inside funX of X");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo D1= new Demo();
		System.out.println(D1.x);
		D1.funX();
		System.out.println(D1.i);
		D1.funA();

	}

}
