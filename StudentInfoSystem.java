abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to display details
    public abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Getter method for roll number
    public int getRollNumber() {
        return rollNumber;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Getter method for subject
    public String getSubject() {
        return subject;
    }

    // Override displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        // Add Student
        Student student = new Student("Alice", 20, 101);

        // Add Teacher
        Teacher teacher = new Teacher("Mr. Smith", 40, "Mathematics");

        // Display details
        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
    }
}
