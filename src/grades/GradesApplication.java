package grades;

import utils.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {

        Input input = new Input();

        HashMap<String, Student> students = new HashMap<>();

        // CREATING STUDENTS //
        Student s1 = new Student("Joe");
        Student s2 = new Student("Lonnie");
        Student s3 = new Student("Jeff");
        Student s4 = new Student("Will");

        // ADDING GRADES //
        s1.addGrade(100);
        s1.addGrade(97.5);
        s1.addGrade(95);
        s2.addGrade(100);
        s2.addGrade(100);
        s2.addGrade(100);
        s3.addGrade(0);
        s3.addGrade(88);
        s3.addGrade(0);
        s4.addGrade(100);
        s4.addGrade(100);
        s4.addGrade(90);

        students.put("joe-sub-cpt", s1);
        students.put("LonnieJobs", s2);
        students.put("wizardry@work", s3);
        students.put("UniversalKey", s4);

        System.out.println(students);

//        System.out.println("""
//                Welcome!
//
//                Here are the GitHub usernames of our students:
//
//                |%s| |%s| |%s| |%s|
//
//                What student would you like to see more information on?
//                """, students[0].);
//
//        String userNameChoice = input.getString();
//        if(!(students.containsKey(userNameChoice))) {
//            System.out.println("""
//                    Sorry, no student found with the GitHub username of "pizza".
//
//                    Would you like to see another student?
//                    [y/N]
//                    """);
//            String userCont = input.getString().toLowerCase();
//            if(userCont.equals("y")) {
//
//            }
//        } else {
//            System.out.println("""
//                    Name: %s - GitHub Username: zgulde
//                    Current Average: 87.4
//                    """, students.get(userNameChoice.getName()));
//        }


    }
}
