package genericsPractice;

public class PrintTypeEle {
	
 public static <T> void fun1(T[] tr) 
 {
		
		for(T t1:tr) 
		{
		System.out.println(t1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //Primitives are not supported
				//int[] nums= {10,20,30,40};
				
				Integer[] nums= {10,20,30,40};
				
				String[] str= {"a","b","c"};
				
				fun1(str);
				
				fun1(nums);

	}

}
