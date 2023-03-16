package minMaxInArray;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,4,6,8,9,7};
		
		Arrays.sort(arr);
      System.out.println(arr[0]);
      System.out.println(arr[arr.length-1]);
	}

}
