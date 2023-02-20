import java.util.*;
class RevString
{
public static void reverseString(String str)
{
   String s= new StringBuilder(str).reverse().toString();
System.out.println(s);
}
public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the String");
String str = sc.next();

reverseString(str);


}

}