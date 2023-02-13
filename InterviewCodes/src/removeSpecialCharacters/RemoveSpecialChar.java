package removeSpecialCharacters;

import java.util.Scanner;

public class RemoveSpecialChar {
 /*
  * There is a given String containing Special characters 
  * except character, digit,and white spaces all are special Symbols. 
  * we have to count the Special Characters and print the String 
  * without special characters and only characters;
  * For this we have the method of character Class
  * Character.isChar(s.charAt(i))
  */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String s= "abc";
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String To Check for Special Characters -");
		String s= sc.nextLine();
		
		int count=0;
		String specialChar="";
		String woSpecialChar="";
		
		for(int i=0;i<s.length();i++)
		{
			if(!Character.isDigit(s.charAt(i))&& !Character.isLetter(s.charAt(i))&& !Character.isWhitespace(s.charAt(i)))
			{
				count++;
				specialChar+=s.charAt(i);
			}
			else
			{
				woSpecialChar+=s.charAt(i);
			}
		}
		if(count==0)
		{
			System.out.println("There is no Speical characters Found !");
		}
		else {
		System.out.println("No. of special Characters "+count);
		System.out.println("special Characters are "+specialChar);
		System.out.println("String without special Characters "+woSpecialChar);
		}
		

	}

}
