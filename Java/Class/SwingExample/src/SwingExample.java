import javax.swing.*;
import java.awt.*;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);
        frame.setLayout(new GridLayout(3, 3));

        JLabel userName = new JLabel("Username");
        JLabel password = new JLabel("Password");

        JTextField userNameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton submit = new JButton("Submit");
        JLabel result = new JLabel("");

        submit.addActionListener(e -> {
            String username = userNameField.getText();
            String pass = new String(passwordField.getPassword());
            if (username.equals("admin") && pass.equals("password")) {
                result.setText("Login successful!");
            } else {
                result.setText("Invalid username or password.");
            }
        });

        frame.add(userName);
        frame.add(userNameField);
        frame.add(password);
        frame.add(passwordField);
        frame.add(submit);
        frame.add(result);

        frame.setVisible(true);
    }
}