package shapes;

import utils.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println("Please enter a radius to create a circle of that size.");
        double userRadius = input.getDouble();
        Circle circle = new Circle(userRadius);
        double userCircumference = circle.getCircumference();
        double userArea = circle.getArea();
        System.out.printf("""
                The Radius of your circle is: %.0f,
                the Circumference of your circle is: %.0f,
                and the Area of your circle is: %.0f.
                """, userRadius, userCircumference, userArea);
    }
}
