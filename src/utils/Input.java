package utils;

import java.util.Scanner;

public class Input {

    private Scanner derScanner;

    // CONSTRUCTORS //
    public Input() {
        this.derScanner = new Scanner(System.in);
    }

    // METHODS //
    public String getString() {
        return this.derScanner.nextLine();
    }

    public boolean yesNo() {
        String inputLowered = this.derScanner.next().toLowerCase();
        return inputLowered.equals("y") || inputLowered.equals("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("Enter a number between %s and %s", min, max);
        int userNumber = this.derScanner.nextInt();
        if (userNumber > max || userNumber < min) {
            getInt(min, max);
        } else {
            System.out.printf("Thank you! %s is between %s and %s", userNumber, min, max);
        }
        return userNumber;
    }

    public int getInt() {
        return this.derScanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a double between %f and %f", min, max);
        double userNumber = this.derScanner.nextDouble();
        if (userNumber > max || userNumber < min) {
            getDouble(min, max);
        } else {
            System.out.printf("Thank you! %f is between %f and %f", userNumber, min, max);
        }
        return userNumber;
    }

    public double getDouble() {
        return this.derScanner.nextDouble();
    }


}
