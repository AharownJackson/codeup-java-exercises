import java.util.Scanner;

public class MethodsExercises {

//    int random = random(0, 100);

    //    problem 1
//    public static int addition(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtraction(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiplication(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static int multiplicationLoop(int num, int times) {
//        int result = 0;
//        for (int i = 0; i < times; i += 1) {
//            result += num;
//        }
//        return result;
//    }
//
//    public static int recursionMultiplication(int num, int times) {
//        int result = 0;
//        if (times > 0) {
//            result = multiplicationLoop(num, times);
//        }
//        return result;
//    }
//
//    public static int division(int num1, int num2) {
//        return num1 / num2;
//    }
//
//    public static int modulus(int num1, int num2) {
//        return num1 % num2;
//    }

    //    problem 2
    public static int getInteger(int min, int max) {

        System.out.printf("""
                Enter a number between %d and %d.
                """, min, max);

        Scanner derScanner = new Scanner(System.in);

        int userInput = derScanner.nextInt();

        if (userInput < min || userInput > max) {
            System.out.println("Bad number.");
            int userInt = getInteger(min, max);

        }
        return userInput;

    }

    //    problem 3
//    public static void getFactorial (int num) {
//        Scanner derScanner = new Scanner(System.in);
//        int runner = 0;
//        while (runner == 0) {
//            System.out.println("""
//                Please enter a number between 1 and 10.
//                """);
//            int userInt = derScanner.nextInt();
//            if(userInt >= 1 && userInt <= 10) {
//                System.out.println("""
//                        do you want to continue? [1 for Yes / 2 for No]
//                        """);
//                int q = derScanner.nextInt();
//                if(q == 1){
//                    userInt!;
//                } else {
//                }
//            }
//
//        }
//    }

    //    problem 5
//public static String higherOrLower(){
//    Scanner scan = new Scanner(System.in);
//    System.out.println("guess a number");
//
//
//
//    int amount = 1;
//    System.out.println(random);
//
//    int guess = Integer.parseInt(scan.nextLine());
//
//
//    if (guess > random){
//        System.out.println("lower");
//        String nope = higherOrLower();
//
//
//    }else if (guess < random){
//        System.out.println("higher");
//        String nope = higherOrLower();
//
//    }else {
//        System.out.println("you got it");
//
//    }
//
//    return "great job!";
//
//
//
//
//};


    //    logging
    public static void main(String[] args) {

//        System.out.println(addition(10, 2));
//        System.out.println(subtraction(10, 2));
//        System.out.println(multiplication(10, 2));
//        System.out.println(division(10, 2));
//        System.out.println(modulus(10, 2));
//        System.out.println(multiplicationLoop(10, 2));
//        System.out.println(recursionMultiplication(10, 2));

        getInteger(0, 100);

    }
}
