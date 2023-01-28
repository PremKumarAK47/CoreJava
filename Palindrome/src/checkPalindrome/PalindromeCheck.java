package checkPalindrome;

import java.util.Scanner;

public class PalindromeCheck {
	public static boolean isPalindrome(String str)
	{
		String s= new StringBuilder(str).reverse().toString();
		if(s.equals(str))
		{
			return true;
		}
		else return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String For check:-");
		String str= sc.nextLine();
        	boolean s=isPalindrome(str);
        if(s)
        {
        	System.out.println("Yes");
        }
        else
        	System.out.println("No");
	
	}
	

}
