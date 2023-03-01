package com.masai;

import java.util.ArrayList;
import java.util.List;

public class ExampleDemo {
	
	
public ArrayList<Students> getStudents(){
	//we can return Linked list also we can return any type of list here
	ArrayList<Students> students =new ArrayList<>();
	students.add(new Students(10,"n1",780));
	students.add(new Students(12,"n2",580));
	students.add(new Students(13,"n3",780));
	students.add(new Students(14,"n3",680));
	return students;
	
}
public static void main(String[] args) {
	ExampleDemo d1= new ExampleDemo();
	
	List<Students> students=d1.getStudents();
	
	for(Students students1:students)
		System.out.println(students1);
	{
		
	}
	
}
}
