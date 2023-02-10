import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        System.out.println("Thank you, God for all you do for me! I love you, and am so grateful for this opportunity!");

        // write a program to get the user age and print out how old they will be in ten years.

        // import Scanner
        // create a scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user with sout to enter age

        System.out.println("Enter your age.");
        // get age with scanner nextLine
        String userAge = scanner.nextLine();

        //convert userAge to num
        int userNumAge = Integer.parseInt(userAge);

        // use sout to print out the user age plus 10
        System.out.println(userNumAge + 10);




    }
}
