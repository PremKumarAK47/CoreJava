package answer1;

public class Demo {
	public static void main(String[] args) {
		Student s1= new Student(17, "Kallu", 19, 350);
//		System.out.println(s1.getRoll());
//		System.out.println(s1.getName());
//		System.out.println(s1.getAge());
//		System.out.println(s1.getMarks());
		//System.out.println(s1);
		if(s1.getAge()>18 && s1.getAge()<60 && s1.getMarks()>0 && s1.getMarks()<500)
		{
			s1.printDetails();
//			System.out.println(s1.getRoll());
//			System.out.println(s1.getName());
//		  System.out.println(s1.getAge());
//		 System.out.println(s1.getMarks());
		}
		else {
			System.out.println("Invaild");
		}
		
		Student s2= new Student();
		s2.setRoll(12);
		s2.setName("Nusrat Jahan");
		s2.setAge(20);
		s2.setMarks(340);
		
		if(s2.getAge()>18 && s2.getAge()<60 && s2.getMarks()>0 && s2.getMarks()<500)
		{
			s2.printDetails();
//			System.out.println(s1.getRoll());
//			System.out.println(s1.getName());
//		  System.out.println(s1.getAge());
//		 System.out.println(s1.getMarks());
		}
		else {
			System.out.println("Invaild");
		}
	}

}
