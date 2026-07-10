package DayFive;

public class App {

    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        // default constructor
        // Student student1 = new Student();
        // student1.name = "John";
        // student1.age = 20;
        // student1.grade = "A";
        // student1.rollNumber = 1;
        // student1.numSubjects = 5;
        // System.out.println("Student 1 name: " + student1.name);
        // System.out.println("Student 1 age: " + student1.age);
        // System.out.println("Student 1 grade: " + student1.grade);
        // System.out.println("Student 1 roll number: " + student1.rollNumber);
        // System.out.println("Student 1 number of subjects: " + student1.numSubjects);

        // student1.study();
        // student1.attendClass();
        // student1.takeExam();
        // student1.sleep();
        // parameterized constructor
        Student student2 = new Student("Alice", 19, "B", 2, 4);
        // System.out.println("Student 2 name: " + student2.name);
        // System.out.println("Student 2 age: " + student2.age);
        // System.out.println("Student 2 grade: " + student2.grade);
        // System.out.println("Student 2 roll number: " + student2.rollNumber);
        // System.out.println("Student 2 number of subjects: " + student2.numSubjects);

        // copy constructor
        Student student3 = new Student(student2);
        System.out.println("Student 3 name: " + student3.name);
        System.out.println("Student 3 age: " + student3.age);
        System.out.println("Student 3 grade: " + student3.grade);
        System.out.println("Student 3 roll number: " + student3.rollNumber);
        System.out.println("Student 3 number of subjects: " + student3.numSubjects);

    }
}
