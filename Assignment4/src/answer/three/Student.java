package answer.three;

public class Student {
	
	int roll;
	String name;
	int marks;
	
	public void displayStudentDetails()
	{
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
		System.out.println("==================");
		
	}
	
	public static void main(String[] args) {
		Student s1= new Student();
		s1.roll=10;
		s1.name="Chandul";
		s1.marks=55;
		s1.displayStudentDetails();
		
		
		Student s2= new Student();
		s2.roll=11;
		s2.name="Mandul";
		s2.marks=60;
		s2.displayStudentDetails();
		
		s1 = null;
        s2 = null;
        // both student objects are now eligible for garbage collection
		
	}

}
