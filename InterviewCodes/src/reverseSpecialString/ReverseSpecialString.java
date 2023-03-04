package reverseSpecialString;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseSpecialString {
	/*
	 * The problem statement of this question is that you have given a 
	 * String which contains special symbols too we have to reverse the 
	 * that String without affecting the special symbols.
	 * 
	 * 
	 */
	
	public static void reversStr(String str)
	{
		char[] chr= str.toCharArray();
		//System.out.println(Arrays.toString(chr));
		//System.out.println(chr.length);
		 int i=0;
		 int j= chr.length-1;
		 
		 while(i<j)
		 {
			 if(!Character.isLetter(chr[i]))
			 {
				 i++;
			 }
			 else if(!Character.isLetter(chr[j]))
			 {
				 j--;
			 }
			 else {
				 char temp=chr[i];
				 chr[i]=chr[j];
				 chr[j]=temp;
				 i++;
				 j--;
			 }
		 }
		String res= new String(chr);
		 System.out.println(res);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String Which contains Special Sympbols");
     String str= sc.next();
	sc.close();
		//String str="ab&#b*c^d";
	    reversStr(str);
	
	}

}
