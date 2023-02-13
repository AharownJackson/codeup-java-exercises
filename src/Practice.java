import java.util.Scanner;

public class Practice {

    public static void printThanks() {
        System.out.println("""
                Thank you, God for all you do for me! I love you, and am so grateful for this opportunity!
                """);
    }

//    public static void printZenith(){
//        System.out.println("Zenith");
//    }

    //    public static int returnSumOfNums (int num1, int num2, int num3){
//        return num1 + num2 + num3;
//    }

    public static void sayName(String name) {
        System.out.printf("""
                Hello %s, how are you today?
                """, name);
    }
    public static void sayName(String first, String last) {
        System.out.printf("""
                Hello %s %s, how are you today?
                """, first, last);
    }




// TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }

    public static int multiplicationLoop(int num, int times) {
        int result = 0;
        for (int i = 0; i < times; i += 1) {
            result += num;
        }
        return result;
    }
    public static double multiplicationLoop(double num, double times) {
        int result = 0;
        for (int i = 0; i < times; i += 1) {
            result += num;
        }
        return result;
    }

    public static int recursionMultiplication(int num, int times) {
        int result = 0;
        if (times > 0) {
            result = multiplicationLoop(num, times);
        }
        return result;
    }
    public static double recursionMultiplication(double num, double times) {
        int result = 0;
        if (times > 0) {
//            result = multiplicationLoop(num, times);
        }
        return result;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static double division(double num1, double num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static void main(String[] args) {
        printThanks();

        sayName("Aharown");
        sayName("Aharown", "Jackson");



    }
}
