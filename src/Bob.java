import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);
        System.out.println("Bob is a lackadaisical teenager. In conversation, his responses are very limited.");
        for (int i = 0; i <= 1; i += 0) {
            System.out.println("Please ask Bob a question.");
            String question = derScanner.nextLine();
            if (question.endsWith("?")) {
                System.out.println("Sure.");
                System.out.println("Do you want to ask Bob another question? [y/N]");
                String userInput = derScanner.nextLine();
                if (userInput.equals("y")) {
                    i += 0;
                } else {
                    i += 1;
                }

            } else if (question.endsWith("!")) {
                System.out.println("Whoa, chill out!");
                System.out.println("Do you want to ask Bob another question? [y/N]");
                String userInput = derScanner.nextLine();
                if (userInput.equals("y")) {
                    i += 0;
                } else {
                    i += 1;
                }

            } else if (question.isEmpty()) {
                System.out.println("Fine. Be that way!");
                System.out.println("Do you want to ask Bob another question? [y/N]");
                String userInput = derScanner.nextLine();
                if (userInput.equals("y")) {
                    i += 0;
                } else {
                    i += 1;
                }


            } else {
                System.out.println("Whatever.");
                System.out.println("Do you want to ask Bob another question? [y/N]");
                String userInput = derScanner.nextLine();
                if (userInput.equals("y")) {
                    i += 0;
                } else {
                    i += 1;
                }
            }
        }
    }
}