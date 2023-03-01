package com.masai;

import java.util.LinkedList;

public class Demo {
	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		// It will hold only INteger
		
		ll.add(10);
		ll.add(30);
		ll.add(20);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.add(null);
		ll.add(null);
		// we can add null
		ll.add(70);
		ll.add(80);
		System.out.println(ll);
		/*
		 * while entering Integer autoboxing and unboxing works 
		 * but compiler don't know how to box and unbox null
		 * so it will give error java.lang.NullPointerException:
		 */
		
//		for(int x:ll) // here chance of nullPointerException
//		{
//			System.out.println(x);
//		}
		
		for(Integer x:ll) // here it will not give error
		{
			System.out.println(x);
		}
	 
	}

}
