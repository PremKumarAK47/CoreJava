package answer.four;

import java.util.Scanner;

public class Numbers2 {

	
	void multiOften(int n)
	{
		if(n%2==0 && n>=0)
		{
            int next_multiple_of_ten = n + (10 - n % 10);
            System.out.println("Input :"+n+" , "+"Output :"+next_multiple_of_ten);
        }
        else if(n%2==1 && n>=0)
        {
            System.out.println("Input :"+n+" , "+"Output :"+n);
        }
        else
        {
            System.out.println("Input :"+n+" , "+"Output : Error");
        }
	}

	
	
	
	
	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a numer- ");
		int n= sc.nextInt();
		Numbers2 num= new Numbers2();
		num.multiOften(n);
		sc.close();
	}

}
