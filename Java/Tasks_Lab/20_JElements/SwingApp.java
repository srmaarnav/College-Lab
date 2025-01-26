import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingApp {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Swing Application");

        // Set the layout manager for the JFrame
        frame.setLayout(new BorderLayout());

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Create a JLabel and JTextField for user input and display
        JLabel label = new JLabel("Enter text:");
        JTextField textField = new JTextField(20);
        
        // Create a JButton
        JButton button = new JButton("Submit");

        // Add an ActionListener to the button to handle button clicks
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();  // Get text from the JTextField
                label.setText("You entered: " + text);  // Update the JLabel with entered text
            }
        });

        // Add the components to the panel
        panel.add(label);
        panel.add(textField);
        panel.add(button);

        // Add the panel to the JFrame
        frame.add(panel, BorderLayout.CENTER);

        // Set the JFrame properties
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
