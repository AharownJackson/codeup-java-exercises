package grades;

import utils.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesApplication {

    public static void runAPP() {
        Input input = new Input();

        Map<String, Student> students = new HashMap<>();
        Map<String, String> studentNames = new HashMap<>();
        Map<String, String> studentGitHubs = new HashMap<>();
        Map<String, String> StudentGitToName = new HashMap<>();
        Map<String, String> StudentGitToGit = new HashMap<>();
        Map<String, String> StudentGitToOBJName = new HashMap<>();

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

        // ADD STUDENTS TO GIT: STUDENT OBJ HASHMAP //
        students.put("joeSubCpt", s1);
        students.put("LonnieJobs", s2);
        students.put("wizardry", s3);
        students.put("UniversalKey", s4);

        // ADD STUDENTS TO STUDENT NAME: NAME HASHMAP //
        studentNames.put("joeSubCpt", "Joe");
        studentNames.put("LonnieJobs", "Lonnie");
        studentNames.put("wizardry", "Jeff");
        studentNames.put("UniversalKey", "Will");

        // ADD STUDENTS TO STUDENT NAME: GIT HASHMAP //
        studentGitHubs.put("Joe", "joeSubCpt");
        studentGitHubs.put("Lonnie", "LonnieJobs");
        studentGitHubs.put("Jeff", "wizardry");
        studentGitHubs.put("Will", "UniversalKey");


        // ADD STUDENTS TO STUDENT GIT TO Git HASHMAP
        StudentGitToGit.put("joeSubCpt", "joeSubCpt");
        StudentGitToGit.put("LonnieJobs", "LonnieJobs");
        StudentGitToGit.put("wizardry", "wizardry");
        StudentGitToGit.put("UniversalKey", "UniversalKey");


        System.out.printf("""
                Welcome!

                Here are the GitHub usernames of our students:

                |%s| |%s| |%s| |%s|

                What student would you like to see more information on?
                """, studentGitHubs.get("Joe"), studentGitHubs.get("Lonnie"), studentGitHubs.get("Jeff"), studentGitHubs.get("Will"));

        String userNameChoice = input.getString();
        if(!(students.containsKey(userNameChoice))) {
            System.out.printf("""
                    Sorry, no student found with the GitHub username of "%s".

                    Would you like to see another student?
                    [y/N]
                    """, userNameChoice);
            String userCont = input.getString().toLowerCase();
            if(userCont.equals("y")) {
                runAPP();
            }
        } else {
            System.out.printf("""
                    Name: %s - GitHub Username: %s
                    Current Average: %.1f
                    """, studentNames.get(userNameChoice), StudentGitToGit.get(userNameChoice), (students.get(userNameChoice).getGradeAverage()) );
        }
        continueAPP();
    }

    public static void continueAPP() {
        Input input = new Input();
        System.out.println("""
                Do you want to continue?
                1 - yes
                2 - no
                """);
        double userCont = input.getDouble();
        if(userCont != 1 || userCont != 2){
            continueAPP();
        } else if(userCont == 2){
            System.out.println("Thank you, have a great day!");
        } else {
          runAPP();
        }
    }


    public static void main(String[] args) {

        runAPP();

    }
}
