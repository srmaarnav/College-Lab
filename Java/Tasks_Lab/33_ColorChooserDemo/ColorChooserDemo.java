import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChooserDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Color Chooser Demo");

        // Create a JPanel with a default background color
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 300));
        panel.setBackground(Color.WHITE);  // Set initial background color to white

        // Create a button to open the color chooser dialog
        JButton colorButton = new JButton("Choose Color");

        // Action listener for the color button
        colorButton.addActionListener(e -> openColorChooserDialog(panel));

        // Set the layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(colorButton, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Set JFrame properties
        frame.setSize(500, 400);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }

    // Method to open the color chooser dialog and change panel background color
    private static void openColorChooserDialog(JPanel panel) {
        // Open the color chooser dialog and store the selected color
        Color selectedColor = JColorChooser.showDialog(null, "Choose a Color", panel.getBackground());

        // If the user selects a color (not canceled)
        if (selectedColor != null) {
            panel.setBackground(selectedColor);  // Change the background color of the panel
        }
    }
}
