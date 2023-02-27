package answer.one;
import java.util.*;
public class CharacterCheck {
	
	 public void checkChar(char c) {
	        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
	                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
	                System.out.println(c + " is a vowel.");
	            } else {
	                System.out.println(c + " is a consonant.");
	            }
	        } else {
	            System.out.println("Error: Invalid character!");
	        }
	    }

	    public static void main(String[] args) {
	    	CharacterCheck obj = new CharacterCheck();
	        Scanner scanner = new Scanner(System.in);

//	        // test with a vowel
//	        System.out.print("Enter a vowel: ");
//	        char vowel = scanner.next().charAt(0);
//	        obj.checkChar(vowel);
//
//	        // test with a consonant
//	        System.out.print("Enter a consonant: ");
//	        char consonant = scanner.next().charAt(0);
//	        obj.checkChar(consonant);
//
//	        // test with an invalid character
//	        System.out.print("Enter an invalid character: ");
//	        char invalidChar = scanner.next().charAt(0);
//	        obj.checkChar(invalidChar);
	        
	        System.out.println("Enter a Character-: ");
	        char ch= scanner.next().charAt(0);
	        obj.checkChar(ch);

	        scanner.close();
	    }

}
