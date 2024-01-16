class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    public Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("------------------------");
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Student defaultStudent = new Student(); // Default constructor
        Student parameterizedStudent = new Student("John Doe", 20); // Parameterized constructor

        // Displaying information
        System.out.println("Default Student Information:");
        defaultStudent.displayInfo();

        System.out.println("Parameterized Student Information:");
        parameterizedStudent.displayInfo();
    }
}
