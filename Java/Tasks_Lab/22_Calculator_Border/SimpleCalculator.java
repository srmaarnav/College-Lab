import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Simple Calculator");

        // Set the layout manager for the JFrame
        frame.setLayout(new BorderLayout());

        // Create a JTextField to display the result (currently no functionality)
        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setEditable(false);
        frame.add(textField, BorderLayout.CENTER);

        // Create the buttons for the calculator
        JButton[] numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
        }
        
        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");
        JButton equalsButton = new JButton("=");
        JButton clearButton = new JButton("C");

        // Create panels for each section of the calculator
        JPanel westPanel = new JPanel();
        westPanel.setLayout(new GridLayout(4, 3));  // 4x3 grid for the numbers 1-9
        for (int i = 1; i <= 9; i++) {
            westPanel.add(numberButtons[i]);
        }
        frame.add(westPanel, BorderLayout.WEST);
        
        JPanel northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(1, 5));  // Row with operator buttons
        northPanel.add(addButton);
        northPanel.add(subButton);
        northPanel.add(mulButton);
        northPanel.add(divButton);
        northPanel.add(equalsButton);

        // Add the north panel to the frame
        frame.add(northPanel, BorderLayout.NORTH);

        // Add the '0' button to the south region
        frame.add(numberButtons[0], BorderLayout.SOUTH);

        // Add the clear button to the east region
        frame.add(clearButton, BorderLayout.EAST);

        // Set JFrame properties
        frame.setSize(300, 400);  // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
