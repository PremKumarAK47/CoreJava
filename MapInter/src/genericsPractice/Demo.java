package genericsPractice;

public class Demo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyGen<Integer>mGen= new MyGen<>(10);
		System.out.println(mGen.getData());
		
		MyGen<Character>mChar=new MyGen<Character>('c');
	    System.out.println(mChar.getData());
	    
	    MyGen<Student> m3= new MyGen<>(new Student(10, "Ram", 500));
		System.out.println(m3.getData());
	    

	}

}
