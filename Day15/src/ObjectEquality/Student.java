package ObjectEquality;

import java.util.Objects;

public class Student {
	private int rollNo;
	private String name;
	private int marks;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean equals(Object obj) {
		Student s1= this;
		Student s2=(Student)obj;
//		if(s1.getRollNo()==s2.getRollNo() && s1.getName()==s2.getName() && s1.getMarks()==s2.getMarks())
//			return true;
//		else
//			return false;
		// or simply return;
		return (s1.getRollNo()==s2.getRollNo() && s1.getName()==s2.getName() && s1.getMarks()==s2.getMarks());
	}
	
	@Override
	public int hashCode() {
		//return rollNo+marks+name.hashCode();
		//or
		return Objects.hash(rollNo,name,marks);
	}
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}

}
