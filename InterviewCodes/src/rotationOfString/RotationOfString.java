package rotationOfString;

public class RotationOfString {
 /*
  * Here We have to check for the given String is Rotation of itSelf or not
  */
	public static boolean roatationCheck(String str1,String str2)
	{
		return (str1.length() == str2.length()) && ((str1+str1).indexOf(str2) != -1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= "ABCD";
		String str2= "CDAB";
		
		//boolean y=roatationCheck(str1,str2);
		if(roatationCheck(str1,str2))
		{
			System.out.println("String is Rotation of itSelf");
			
		}
		else
		{
			System.out.println("String is not Rotation of itSelf");
		}

	}

}
