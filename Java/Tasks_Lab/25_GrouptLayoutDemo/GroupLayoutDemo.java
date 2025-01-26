import javax.swing.*;
import java.awt.*;

public class GroupLayoutDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("GroupLayout Demo");

        // Set the layout manager for the JFrame to GroupLayout
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.setLayout(layout);

        // Create JLabel and JTextField
        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15); // 15 columns wide

        // Define the horizontal group (horizontal alignment of components)
        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addComponent(label) // Add label
                .addComponent(textField) // Add text field next to the label
        );

        // Define the vertical group (vertical alignment of components)
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(label) // Align label to the left
                .addComponent(textField) // Align text field next to the label
        );

        // Set JFrame properties
        frame.setSize(300, 100);  // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
