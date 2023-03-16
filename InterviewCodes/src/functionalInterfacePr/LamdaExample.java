package functionalInterfacePr;

public class LamdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Drawable d= new Drawable() {
			
			@Override
			public void draw(int n) {
				// TODO Auto-generated method stub
				System.out.println("Picture is Drawn with number "+ n);
				
			}
		};
		
		d.draw(5);
		//using Lambda Expression;
		
		Drawable dLamda =(width)->{
			System.out.println("Picture is Drawn with "+ width);
			};
		dLamda.draw(6);

	}

}
