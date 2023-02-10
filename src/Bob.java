import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner derScanner = new Scanner(System.in);
        System.out.println("Bob is a lackadaisical teenager. In conversation, his responses are very limited. Please ask Bob a question.");
        String question = derScanner.nextLine();
        if(question.endsWith("?")){
            System.out.println("Sure.");
        } else if(question.endsWith("!")){
            System.out.println("Whoa, chill out!");
        } else if(question.isEmpty()){
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }
        System.out.println("Do you want to continue: [y/N]");
        String userInput = derScanner.nextLine();
        if(userInput.equals("y")){
            // run the program again.
        }


    }
}
