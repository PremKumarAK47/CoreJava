package com.masai;

import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {
		Vector<Integer> vl =new Vector<>();
		//ll==vl
		
		vl.add(10);
		vl.add(30);
		vl.add(20);
		vl.add(40);
		vl.add(50);
	    vl.add(60);
		vl.add(null);
		vl.add(null);
		// we can add null
		vl.add(70);
		vl.add(80);
		System.out.println(vl);
		//Same as Linked List
	//	for(int x:ll) // here chance of nullPointerException
//			{
//				System.out.println(x);
//			}
			
			for(Integer x:vl) // here it will not give error
			{
				System.out.println(x);
			}
		//lec15 48 min
			// Vector's most of the methods are synchronized ;
	}
}
