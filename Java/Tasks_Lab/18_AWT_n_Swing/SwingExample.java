import javax.swing.*;
import java.awt.event.*;

public class SwingExample {
    public static void main(String[] args) {
        // Create a frame
        JFrame frame = new JFrame("Swing Example");

        // Create a label
        JLabel label = new JLabel("Enter text: ");
        label.setBounds(50, 50, 100, 30);

        // Create a text field
        JTextField textField = new JTextField();
        textField.setBounds(150, 50, 200, 30);

        // Create a button
        JButton button = new JButton("Submit");
        button.setBounds(150, 100, 100, 30);

        // Create a result label
        JLabel resultLabel = new JLabel();
        resultLabel.setBounds(150, 150, 200, 30);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You entered: " + textField.getText());
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        // Set layout to null (absolute positioning)
        frame.setLayout(null);

        // Set the size and visibility of the frame
        frame.setSize(400, 250);
        frame.setVisible(true);

        // Close the frame when the user closes it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
