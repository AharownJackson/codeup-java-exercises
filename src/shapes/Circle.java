package shapes;

public class Circle {

    private double radius;

    // CONSTRUCTORS //

    public Circle(double radius) {
        this.radius = radius;
    }

    // GETTERS / SETTERS //

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // METHODS //
    public double getArea() {
        double radiusSquared = Math.pow(this.radius, 2);
        return radiusSquared * Math.PI;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }



}
