package answer3;

public class Demo {
	public static void main(String[] args) {
		Student s1= new Student().getStudent(true);
		//Student.getStudent(true); 
		//Student.getStudent(true);
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCollageName());
		System.out.println("=================================");
		
		Student s2= new Student().getStudent(false);
		//Student.getStudent(false);
		//Student.getStudent(false);
		
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getCollageName());
		System.out.println("=================================");
	}

}
