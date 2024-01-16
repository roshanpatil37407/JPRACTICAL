
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventHandlingDemo extends JFrame {
    private JButton button;
    private JLabel label;

    public EventHandlingDemo() {
        // Set frame properties
        setTitle("Event Handling Demo");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create and set layout manager
        setLayout(new FlowLayout());

        // Create components
        button = new JButton("Click me");
        label = new JLabel("No event yet");

        // Add components to the frame
        add(button);
        add(label);

        // Add ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button clicked!");
            }
        });

        // Add MouseListener to the label
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Label clicked!");
            }
        });

        // Add WindowListener to the frame
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(EventHandlingDemo.this, "Window is closing!");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventHandlingDemo().setVisible(true);
            }
        });
    }
}
