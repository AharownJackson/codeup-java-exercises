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
        System.out.println("Enter a string: ");
        return this.derScanner.nextLine();
    }

    public Boolean yesNo() {
        System.out.println("[y/N]");
        String inputLowered = this.derScanner.nextLine().toLowerCase();
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
        System.out.println("Enter an integer: ");
        return this.derScanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter a number between %f and %f", min, max);
        double userNumber = this.derScanner.nextDouble();
        if (userNumber > max || userNumber < min) {
            getDouble(min, max);
        } else {
            System.out.printf("Thank you! %f is between %f and %f", userNumber, min, max);
        }
        return userNumber;
    }

    public double getDouble() {
        System.out.println("Enter a number: ");
        return this.derScanner.nextDouble();
    }


}
