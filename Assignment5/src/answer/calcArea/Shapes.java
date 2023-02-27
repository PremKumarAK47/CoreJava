package answer.calcArea;

public class Shapes {
	 public void area(Circle circle) {
		 
		 double ar= circle.radius*circle.radius*3.14;
		 
	        //System.out.println("Area of Circle: " + (3.14 * circle.radius * circle.radius));
	        System.out.println("Area of Circle: " + ar);
	    }

	    public void area(Rectangle rectangle) {
	        System.out.println("Area of Rectangle: " + (rectangle.length * rectangle.breadth));
	    }

	    public void area(Square square) {
	        System.out.println("Area of Square: " + (square.side * square.side));
	    }

}
