import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class ButtonClickDemo {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Button Click Demo");

        // Create a JLabel to display the message
        JLabel label = new JLabel("Click the button!");

        // Create a JButton
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Button Clicked!"); // Change the label text when button is clicked
            }
        });

        // Set the layout and add components
        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.add(label);

        // Set frame properties
        frame.setSize(300, 150);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
