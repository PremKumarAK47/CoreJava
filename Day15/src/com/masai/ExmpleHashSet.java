package com.masai;

import java.util.HashSet;

public class ExmpleHashSet {
	public static void main(String[] args) {
		
		HashSet<Students> hs= new HashSet<>();
	
		hs.add(new Students(10,"n1",780));
		hs.add(new Students(11,"n2",880));
		hs.add(new Students(12,"n3",980));
		hs.add(new Students(13,"n1",780));
		hs.add(new Students(10,"n1",780));
		
		System.out.println(hs.size());
		
	}

}
