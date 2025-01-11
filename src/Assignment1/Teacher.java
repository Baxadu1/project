package Assignment1;

public class Teacher extends Person {

    String subject;
    int yearsOfExperience;
    int salary;

    public Teacher(String name, String surname, int age, boolean gender,
                   String subject, int yearsOfExperience, int salary) {
        super(name, surname, age, gender);
        this.subject = subject;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
    }
    public void giveRaise(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100.0);
        }
    }
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + " I teach " + subject + ".";
    }
}

