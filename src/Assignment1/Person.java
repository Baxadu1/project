package Assignment1;

public class Person {
    private String name;
    private String surname;
    private int age;
    private boolean gender;
    public Person(String name, String surname, int age, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
    public String toString() {
        String genderStr = gender ? "male" : "female";
        return "Hi, I am " + name + " " + surname + " a " + age + " years old " + genderStr + " . ";
    }
}

