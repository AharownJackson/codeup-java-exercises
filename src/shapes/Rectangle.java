package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    protected int length;
    protected int width;

    // CONSTRUCTOR //
    public Rectangle() {

    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }

    // METHODS //

    // getArea() - calculates the area of an instance of Rectangle.
    public double getArea() {
        return this.length * this.width;
    }

    // getPerimeter() - calculates the perimeter of an instance of Rectangle.
    public double  getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
