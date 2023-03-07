package nonRepeated;

public class FirstNotRepeatedChar {
	/*
	 * Given String = Stress;
	 * find first non repeating character
	 * o/p='t'
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str="stress";
     int n=str.length();
     boolean flag= false;
      for(int i=0;i<n;i++)
      {
    	  flag=false;
    	  for(int j=i+1;j<n;j++)
    	  {
    		  if(str.charAt(i)==str.charAt(j))
    		  {
    			  flag=true;
    			  break;
    		  }
    	  }
    	  
    	  if(!flag)
          {
        	 System.out.println(str.charAt(i));
        	 break;
          }
      }
      
	}

}
