package DayFive;

public class Student {

    // Attributes
    public String name;
    public int age;
    public String grade;
    public int rollNumber;
    public int numSubjects;

    // Default constructor/ attribute -> garbage value
    public Student() {
        System.out.println("student constructor called.");
        // this.name = "Unknown";
        // this.age = 0;
        // this.grade = "N/A";
        // this.rollNumber = 0;
        // this.numSubjects = 0;
    }

    // parameterized constructor
    public Student(String name, int age, String grade, int rollNumber, int numSubjects) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.numSubjects = numSubjects;
    }

    // copy constructor
    public Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.grade = other.grade;
        this.rollNumber = other.rollNumber;
        this.numSubjects = other.numSubjects;
    }

    // method /Behaviors
    public void study() {
        System.out.println(name + " is studying.");
    }

    public void attendClass() {
        System.out.println(name + " is attending class.");
    }

    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
