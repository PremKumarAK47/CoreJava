package com.masai;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.add(90);
		st.add(89);
		st.push(20);
		System.out.println(st);
		System.out.println(st.peek());
		System.out.println(st.pop());
		// It comes Under Vector class but it has some more methods;
		
	}
}
