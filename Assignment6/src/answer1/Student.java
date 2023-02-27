package answer1;

public class Student  {
private int roll; 
private String name;
private int age;
private int marks;

public Student() {
	// TODO Auto-generated constructor stub
}

public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	//if(this.age>18 && this.age <60)
		this.age = age;
		//else
		//	System.out.print("Inavalid Details...");
	
}

public int getMarks() {

	return marks;
}

public void setMarks(int marks) {
	//if(this.marks>0 && this.marks<500)
	this.marks = marks;
	//else
		//System.out.print("Invalid..");
}

public Student(int roll, String name, int age, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.age = age;
	this.marks = marks;
//	System.out.println(getRoll());
//	System.out.println(getName());
//	System.out.println(getAge());
//	System.out.println(getMarks());
}

public void printDetails()
{
	System.out.println("Student Roll is "+ roll);
	System.out.println("Student Name is "+ name);
	System.out.println("Student Age is "+ age);
	System.out.println("Student Marks is "+ marks);
	System.out.println("=============================");
}




}
