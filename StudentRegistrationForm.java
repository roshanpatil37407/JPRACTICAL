
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentRegistrationForm extends JFrame {
    private JTextField nameField, ageField, courseField;

    public StudentRegistrationForm() {
        // Set frame properties
        setTitle("Student Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create and set layout manager
        setLayout(new GridLayout(4, 2, 10, 10));

        // Create components
        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();

        JLabel ageLabel = new JLabel("Age:");
        ageField = new JTextField();

        JLabel courseLabel = new JLabel("Course:");
        courseField = new JTextField();

        JButton submitButton = new JButton("Submit");

        // Add components to the frame
        add(nameLabel);
        add(nameField);
        add(ageLabel);
        add(ageField);
        add(courseLabel);
        add(courseField);
        add(submitButton);

        // Add ActionListener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitForm();
            }
        });
    }

    private void submitForm() {
        // Retrieve values from text fields
        String name = nameField.getText();
        String age = ageField.getText();
        String course = courseField.getText();

        // Display the submitted information
        JOptionPane.showMessageDialog(this,
                "Registration Successful!\nName: " + name + "\nAge: " + age + "\nCourse: " + course,
                "Success",
                JOptionPane.INFORMATION_MESSAGE);

        // Clear the form
        nameField.setText("");
        ageField.setText("");
        courseField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentRegistrationForm().setVisible(true);
            }
        });
    }
}
