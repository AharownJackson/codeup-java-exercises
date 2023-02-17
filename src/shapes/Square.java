package shapes;

public class Square extends Rectangle{

    protected int side;

    // CONSTRUCTOR //
    public Square(int side) {
        this.side = side;
        super.length = side;
        super.width = side;
    }

    // METHODS //


    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    @Override
    public int getPerimeter() {
        return 4 * side;
    }
}
