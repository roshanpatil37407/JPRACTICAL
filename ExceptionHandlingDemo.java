
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Getting input from the user
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Performing a division that may cause an exception
            int result = 10 / number;

            // Displaying the result
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            // Handling arithmetic exception (division by zero)
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handling other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            // Closing the scanner in the finally block to ensure it is always closed
            scanner.close();
        }
    }
}
