import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleToolbarDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Simple Toolbar Demo");

        // Create a toolbar (JToolBar)
        JToolBar toolbar = new JToolBar();

        // Create buttons for common actions
        JButton newButton = new JButton("New");
        JButton openButton = new JButton("Open");
        JButton saveButton = new JButton("Save");

        // Add tooltips to the buttons
        newButton.setToolTipText("Create a new file");
        openButton.setToolTipText("Open an existing file");
        saveButton.setToolTipText("Save the current file");

        // Add buttons to the toolbar
        toolbar.add(newButton);
        toolbar.add(openButton);
        toolbar.add(saveButton);

        // Add action listeners for buttons
        newButton.addActionListener(e -> System.out.println("New button clicked"));
        openButton.addActionListener(e -> System.out.println("Open button clicked"));
        saveButton.addActionListener(e -> System.out.println("Save button clicked"));

        // Add the toolbar to the top of the frame
        frame.add(toolbar, BorderLayout.NORTH);

        // Set JFrame properties
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
