import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("3x3 Grid of Buttons");

        // Set the layout manager for the JFrame to GridLayout (3 rows, 3 columns)
        frame.setLayout(new GridLayout(3, 3));

        // Create buttons labeled from 1 to 9
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            frame.add(button);  // Add button to the frame
        }

        // Set JFrame properties
        frame.setSize(300, 300);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}