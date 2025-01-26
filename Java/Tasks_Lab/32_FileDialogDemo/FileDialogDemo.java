import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.nio.file.*;

public class FileDialogDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("File Dialog Demo");

        // Create a JTextArea to display file contents
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setEditable(false);  // Make it non-editable
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Create a button to open the file dialog
        JButton openButton = new JButton("Open File");

        // Action listener for the Open button
        openButton.addActionListener(e -> openFileDialog(textArea));

        // Set the layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(openButton, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set JFrame properties
        frame.setSize(600, 400);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }

    // Method to open the file dialog and read the file contents into JTextArea
    private static void openFileDialog(JTextArea textArea) {
        // Create a file chooser dialog
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select a File");

        // Show the open dialog
        int result = fileChooser.showOpenDialog(null);

        // If the user selects a file
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();

            // Read the file contents and display them in JTextArea
            try {
                // Read the entire file content into a String
                String content = Files.readString(selectedFile.toPath());
                textArea.setText(content);  // Set the text of the JTextArea
            } catch (IOException e) {
                // Handle file reading errors
                JOptionPane.showMessageDialog(null, "Error reading file: " + e.getMessage());
            }
        }
    }
}
