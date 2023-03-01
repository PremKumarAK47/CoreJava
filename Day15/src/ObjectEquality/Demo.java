package ObjectEquality;

import java.util.HashSet;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student s1= new Student(10,"n1",780);
//		Student s2= new Student(10,"n1",780);
//		
//		System.out.println(s1==s2);
//		System.out.println(s1.equals(s2));
		// when we need to make two object equal then we need to override the method
		HashSet<Student> hs =new HashSet<>();
		hs.add(new Student(10,"n1",780));
		hs.add(new Student(12,"n2",780));
		hs.add(new Student(13,"n3",780));
		hs.add(new Student(10,"n1",780));
		hs.add(new Student(10,"n1",780));
		
		System.out.println(hs.size());

	}

}
