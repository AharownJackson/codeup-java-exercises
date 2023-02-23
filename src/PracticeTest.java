public class PracticeTest {

    public static void main(String[] args) {


        try {

        Practice practice = new Practice();
        System.out.println(practice.testString.length());
        String newSubString = practice.testString.substring(25);

        } catch(IndexOutOfBoundsException error) {
            System.out.println("This is out of bounds");
            error.printStackTrace();
        }

    }
}
