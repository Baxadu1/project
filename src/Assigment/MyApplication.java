 import java.util .*;
    interface Payable {
        double getPaymentAmount();
    }
    class Person implements Payable, Comparable<Person> {
        private static int idCounter = 0;
        private final int id;
        private String name;
        private String surname;

        public Person() {
            this.id = ++idCounter;
        }

        public Person(String name, String surname) {
            this();
            this.name = name;
            this.surname = surname;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPosition() {
            return "Student";
        }

        public String toString() {
            return id + ". " + name + " " + surname;
        }

        public double getPaymentAmount() {
            return 0.0;
        }

        public int compareTo(Person other) {
            return Double.compare(other.getPaymentAmount(), this.getPaymentAmount());
        }
    }
    class Employee extends Person {
        private String position;
        private double salary;

        public Employee() {
            super();
        }

        public Employee(String name, String surname, String position, double salary) {
            super(name, surname);
            this.position = position;
            this.salary = salary;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String toString() {
            return "Employee: " + super.toString();
        }

        public double getPaymentAmount() {
            return salary;
        }
    }

    class Student extends Person {
        private double gpa;
        private static final double STIPEND = 36660.00;

        public Student() {
            super();
        }

        public Student(String name, String surname, double gpa) {
            super(name, surname);
            this.gpa = gpa;
        }

        public double getGpa() {
            return gpa;
        }

        public void setGpa(double gpa) {
            this.gpa = gpa;
        }

        public String toString() {
            return "Student: " + super.toString();
        }

        public double getPaymentAmount() {
            return gpa > 2.67 ? STIPEND : 0.0;
        }
    }

    public class MyApplication {
        public static void main(String[] args) {
            List<Person> people = new ArrayList<>();

            people.add(new Employee("Bakyt", "Kuanysh", "Manager", 27045.78));
            people.add(new Employee("Danial", "Amangeldi", "Engineer", 50000.00));
            people.add(new Student("Ramazan", "Seilibek", 2.5));
            people.add(new Student("Alinyr", "Tursynbaev", 3.8));

            Collections.sort(people);
            printData(people);
        }

        public static void printData(Iterable<Person> people) {
            for (Person p : people) {
                System.out.println(p.toString() + " earns " + p.getPaymentAmount() + " tenge");
            }
        }
    }
