package answer.calcArea;

public class Main {

	public static void main(String[] args) {
		
		Shapes sh = new Shapes();
		
		Circle circle= new Circle(5);
		sh.area(circle);
		
		Rectangle rect= new Rectangle(5, 7);
		sh.area(rect);
		
		Square sq= new Square(7);
		sh.area(sq);
		
	}
}
