package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

    // CONSTRUCTORS //
    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        super(length, width);
    }

    // METHODS //
    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
}
