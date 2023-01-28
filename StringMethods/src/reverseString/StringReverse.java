package reverseString;

import java.util.Scanner;

public class StringReverse {
	
	public static void reverseString(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the String-:");
		String str= sc.nextLine();
		reverseString(str);

	}

}
