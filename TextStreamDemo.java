import java.io.*;

public class TextStreamDemo {
    public static void main(String[] args) {
        try {
            // Creating a BufferedReader to take input from the user
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Asking the user for input
            System.out.print("Enter some text: ");
            String userInput = reader.readLine();

            // Creating a BufferedWriter to write to a text file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            // Writing the user input to the text file
            writer.write(userInput);

            // Closing the BufferedWriter
            writer.close();

            System.out.println("Text written to 'output.txt' successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
