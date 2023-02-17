package shapes;

public class ShapesTest {

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(5, 4);
        int box1Area = box1.getArea();
        int box1Perimeter = box1.getPerimeter();
        System.out.println(box1Area);
        System.out.println(box1Perimeter);

        Rectangle box2 = new Square(5);
        int box2Area = box2.getArea();
        int box2Perimeter = box2.getPerimeter();
        System.out.println(box2Area);
        System.out.println(box2Perimeter);

    }
}
