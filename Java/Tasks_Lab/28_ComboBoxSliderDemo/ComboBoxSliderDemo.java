import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxSliderDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("ComboBox and Slider Demo");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1, 10, 10));

        // Create a JComboBox for selecting a country
        String[] countries = {"USA", "Canada", "Nepal", "UK", "Australia"};
        JComboBox<String> countryComboBox = new JComboBox<>(countries);

        // Create a JSlider for selecting an age (from 0 to 100)
        JSlider ageSlider = new JSlider(0, 100, 25);
        ageSlider.setMajorTickSpacing(10);
        ageSlider.setMinorTickSpacing(1);
        ageSlider.setPaintTicks(true);
        ageSlider.setPaintLabels(true);

        // Create a JLabel to display the selected country and age
        JLabel resultLabel = new JLabel("Selected Country: None, Age: 25");

        // Add components to the panel
        panel.add(new JLabel("Select a country:"));
        panel.add(countryComboBox);
        panel.add(new JLabel("Set your age:"));
        panel.add(ageSlider);
        panel.add(resultLabel);

        // Add panel to the frame
        frame.add(panel);

        // Add action listeners for the JComboBox and JSlider
        countryComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateResultLabel(countryComboBox, ageSlider, resultLabel);
            }
        });

        ageSlider.addChangeListener(e -> updateResultLabel(countryComboBox, ageSlider, resultLabel));

        // Set JFrame properties
        frame.setSize(300, 200);  // Set the window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }

    // Method to update the result label based on the selected country and age
    private static void updateResultLabel(JComboBox<String> countryComboBox, JSlider ageSlider, JLabel resultLabel) {
        String selectedCountry = (String) countryComboBox.getSelectedItem();
        int selectedAge = ageSlider.getValue();
        resultLabel.setText("Selected Country: " + selectedCountry + ", Age: " + selectedAge);
    }
}
