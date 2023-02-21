package shapes;

abstract public class Quadrilateral extends Shape {
     protected int length;
     protected int width;

     // CONSTRUCTORS //
    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // GETTERS //
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // SETTERS ABSTRACT //

    abstract public void setLength(int length);

    abstract public void setWidth(int width);
}
