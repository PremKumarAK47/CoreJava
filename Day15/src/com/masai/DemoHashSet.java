package com.masai;

import java.util.HashSet;

public class DemoHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(10);
		hs.add(null);
		hs.add(null);
		//Null is possible only once
		System.out.println(hs.size());
		System.out.println(hs);
		//We Can't use iterator cause it does'nt follow IndexBased 
		//Acessing each element;
		// here we can't use for loop we can only use enhanced for loop cause it does'nt store on index based
		//HashSet is very much relTable with hashmap
		//internally using Hashmap;
		for(Integer i1:hs)
		{
			System.out.println(i1);
		}
		
	}

}
