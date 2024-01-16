import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    double marks;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("------------------------");
    }
}

public class StudentInformationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Create an array to store student objects
        Student[] students = new Student[numberOfStudents];

        // Input student details
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Enter name: ");
            String name = scanner.next();
            System.out.print("Enter roll number: ");
            int rollNumber = scanner.nextInt();
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();

            // Create a new Student object and store it in the array
            students[i] = new Student(name, rollNumber, marks);
        }

        // Display student information
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
        }

        // Close the scanner
        scanner.close();
    }
}
