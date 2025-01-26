import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormValidationDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Form with Validation");

        // Create JPanel to hold form components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2, 10, 10));

        // Create components for the form
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);
        JLabel commentsLabel = new JLabel("Comments:");
        JTextArea commentsArea = new JTextArea(3, 20);
        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(commentsLabel);
        panel.add(new JScrollPane(commentsArea)); // Scroll pane for JTextArea
        panel.add(submitButton);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener for submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Validate the form fields
                String name = nameField.getText().trim();
                String password = new String(passwordField.getPassword()).trim();
                String comments = commentsArea.getText().trim();

                // Check if any field is empty
                if (name.isEmpty() || password.isEmpty() || comments.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "All fields must be filled out!", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(frame, "Form submitted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        // Set JFrame properties
        frame.setSize(300, 200);  // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
