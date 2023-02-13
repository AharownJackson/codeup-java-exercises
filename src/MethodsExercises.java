public class MethodsExercises {

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int multiplicationLoop(int num, int times) {
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

    public static int division(int num1, int num2) {
        return num1 / num2;
    }

    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }


//    logging
    public static void main(String[] args) {

        System.out.println(addition(10, 2));
        System.out.println(subtraction(10, 2));
        System.out.println(multiplication(10, 2));
        System.out.println(division(10, 2));
        System.out.println(modulus(10, 2));
        System.out.println(multiplicationLoop(10, 2));
        System.out.println(recursionMultiplication(10, 2));



    }
}
