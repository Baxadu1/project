import java.util.ArrayList;import java.util.List;
public class Student extends Person {
    private static int id = 1;    private int id_gen;
    private List<Integer> grades;
    public Student(String name, String surname, int age, boolean gender) {        super(name, surname, age, gender);
        this.id_gen = id++;        this.grades = new ArrayList<>();
    }
    public void addGrade(int grade) {        if (grade >= 0 && grade <= 100) {
        grades.add(grade);        }
    }
    public double calculateGPA() {        if (grades.isEmpty()) {
        return 0.0;        }
        int sum = 0;        for (int g : grades) {
            sum += g;        }
        return (double) sum / grades.size();    }
    public int getId_gen() {
        return id_gen;    }
    @Override
    public String toString() {        return super.toString()
            + " I am a student with ID " + id_gen + ".";    }
}