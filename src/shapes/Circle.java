package shapes;

import utils.Input;

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

    public static Circle createCircle() {
        Input input = new Input();
        System.out.println("Please enter a radius to create a circle of that size.");
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        System.out.printf("""
                ========== Your Circle ==========
                  Radius        |  %.2f
                  Circumference |  %.2f
                  Area          |  %.2f
                =================================
                """, userRadius, circle.getCircumference(), circle.getArea());
        System.out.println("Do you want to continue: ");
        boolean userCont = input.yesNo();
        if(!userCont){
            System.out.println("Thanks, have a nice day");
        } else {
            createCircle();
        }
        return circle;
    }

}
