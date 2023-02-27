package answer.four;

public class Numbers 
{
	int n;
	void multiOften()
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
		Numbers n1= new Numbers();
		n1.n=45;
		n1.multiOften();
		
		Numbers n2= new Numbers();
		n2.n=44;
		n2.multiOften();
		
		Numbers n3= new Numbers();
		n3.n=-5;
		n3.multiOften();
		
	}
}
