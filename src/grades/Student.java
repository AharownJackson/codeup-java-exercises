package grades;

import utils.Input;

import java.util.ArrayList;

public class Student {

    // PROPERTIES //
    private String name;
    private ArrayList<Double> grades;

    // CONSTRUCTORS //
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // GETTERS //
    public String getName() {
        return name;
    }

//    public double getGradeAverage() {
//        double total = 0;
//        for(Double grade : grades) {
//            total += grade;
//        }
//        return total / grades.size;
//    }

    public void addGrade(double grade) {
        grades.add(grade);
    }
}
