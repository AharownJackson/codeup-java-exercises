package shapes;

public class Square extends Quadrilateral {

    protected int side;

    // CONSTRUCTOR //
    public Square(int side) {
        this.side = side;
        super.length = side;
        super.width = side;
    }

    // METHODS //
    @Override
    public double getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void setLength(int length) {

    }

    @Override
    public void setWidth(int width) {

    }
}
