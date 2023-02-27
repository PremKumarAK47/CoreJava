package answer.three;
class Circle{
    int radius;
}
class Rectangle{
   
    int length ;
    int breadth ;
}
class Square {

 
    int side;
}
class Shapes {

public void area(Circle circle){
    System.out.println("Area of circle : " + Math.PI*circle.radius*circle.radius);
}
public void area(Rectangle rectangle){
    System.out.println("Area of Rectangle : " + rectangle.length * rectangle.breadth);
}
public void area(Square square){
    System.out.println("Area of Square : "+ square.side*square.side );
}

      
public static void main(String[] args) {
    
    
    Shapes s1 = new Shapes();
    //s1.area(new Circle());
    // s1.area(new Rectangle());
    // s1.area(new Square());
    // For using above 3 statement directly , have to declare variable value in class itself-Check commented line in Class for refrence
    
    Circle c1 = new Circle();
    c1.radius = 4;
    s1.area(c1);
    
    Rectangle r1 = new Rectangle();
    r1.length = 5;
    r1.breadth = 4;
    s1.area(r1);
    
    Square sq1 = new Square();
    sq1.side = 7;
    s1.area(sq1);
   
}
}

//In above problem we used same method name Area for different Shaped  
//which are defined with different class
//having different varaiablr to find the area
