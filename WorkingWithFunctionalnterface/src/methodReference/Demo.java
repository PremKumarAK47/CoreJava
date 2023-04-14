package methodReference;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//First Method
		Inter i2=num  -> {
			int result =Integer.parseInt(num);
			return result;
		};
		System.out.println(i2.getTheNumber("100")+200);
		
		
		//Second Method
		Inter i1=snum->Integer.parseInt(snum);
		//i1.getTheNumber("100");
		System.out.println(i1.getTheNumber("100"+100));//concatenation
		System.out.println(i1.getTheNumber("100")+100);
        
		Inter i3= Integer :: parseInt;
		System.out.println(i3.getTheNumber("300")+30);
	}

}
