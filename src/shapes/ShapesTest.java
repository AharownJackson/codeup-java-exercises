package shapes;

public class ShapesTest {

    public static void main(String[] args) {

        Measurable mySquare = new Square(5);
        Measurable myRectangle = new Rectangle(5, 4);

        System.out.printf("""
        The perimeter of your rectangle is: %.0f
        """, myRectangle.getPerimeter());
        System.out.printf("""
        The area of your rectangle is: %.0f
        """, myRectangle.getArea());
        System.out.printf("""
        The perimeter of your square is: %.0f
        """, mySquare.getPerimeter());
        System.out.printf("""
        The area of your square is: %.0f
        """, mySquare.getArea());

//        mySquare.getLength();
//        mySquare.getWidth();

//        Rectangle box1 = new Rectangle(5, 4);
//        double box1Area = box1.getArea();
//        double box1Perimeter = box1.getPerimeter();
//        System.out.println(box1Area);
//        System.out.println(box1Perimeter);
//
//        Square box2 = new Square(5);
//        double box2Area = box2.getArea();
//        double box2Perimeter = box2.getPerimeter();
//        System.out.println(box2Area);
//        System.out.println(box2Perimeter);

    }
}
