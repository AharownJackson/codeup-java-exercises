package shapes;

public class Rectangle {
    protected int length;
    protected int width;

    // CONSTRUCTOR //
    public Rectangle() {

    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // METHODS //

    // getArea() - calculates the area of an instance of Rectangle.
    public int getArea() {
        return this.length * this.width;
    }

    // getPerimeter() - calculates the perimeter of an instance of Rectangle.
    public int  getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }
}
