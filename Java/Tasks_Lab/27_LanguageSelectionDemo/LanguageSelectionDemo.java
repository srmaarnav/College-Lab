import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSelectionDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Language Selection");

        // Create JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1, 10, 10));

        // Create JCheckBox for additional languages
        JCheckBox additionalLangCheckBox = new JCheckBox("Include Other Languages");

        // Create JRadioButtons for programming languages
        JRadioButton javaRadioButton = new JRadioButton("Java");
        JRadioButton pythonRadioButton = new JRadioButton("Python");
        JRadioButton cPlusPlusRadioButton = new JRadioButton("C++");

        // Group the radio buttons so only one can be selected at a time
        ButtonGroup group = new ButtonGroup();
        group.add(javaRadioButton);
        group.add(pythonRadioButton);
        group.add(cPlusPlusRadioButton);

        // Create JLabel to show the selected options
        JLabel resultLabel = new JLabel("Selected Languages: None");

        // Add components to the panel
        panel.add(javaRadioButton);
        panel.add(pythonRadioButton);
        panel.add(cPlusPlusRadioButton);
        panel.add(additionalLangCheckBox);
        panel.add(resultLabel);

        // Add panel to the frame
        frame.add(panel);

        // Add action listener for when a selection is made
        ActionListener languageSelectionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLanguages = "Selected Languages: ";

                // Check which radio button is selected
                if (javaRadioButton.isSelected()) {
                    selectedLanguages += "Java ";
                } 
                if (pythonRadioButton.isSelected()) {
                    selectedLanguages += "Python ";
                } 
                if (cPlusPlusRadioButton.isSelected()) {
                    selectedLanguages += "C++ ";
                }

                // Check if the additional language checkbox is selected
                if (additionalLangCheckBox.isSelected()) {
                    selectedLanguages += "(Other Languages)";
                }

                // Update the result label
                resultLabel.setText(selectedLanguages);
            }
        };

        // Add the action listener to each radio button and checkbox
        javaRadioButton.addActionListener(languageSelectionListener);
        pythonRadioButton.addActionListener(languageSelectionListener);
        cPlusPlusRadioButton.addActionListener(languageSelectionListener);
        additionalLangCheckBox.addActionListener(languageSelectionListener);

        // Set JFrame properties
        frame.setSize(300, 250);  // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
