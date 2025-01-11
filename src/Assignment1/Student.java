package Assignment1;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private static int lastAssignedId = 0;
    private int studentID;
    private List<Integer> grades;


    public Student(String name, String surname, int age, boolean gender) {
        super(name, surname, age, gender);
        this.studentID = ++lastAssignedId;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }

    public double calculateGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int g : grades) {
            sum += g;
        }
        return (double) sum / grades.size();
    }

    public String toString() {
        return super.toString()
                + " I am a student with ID " + studentID + ".";
    }

    public int getStudentID() {
        return studentID;
    }
}

