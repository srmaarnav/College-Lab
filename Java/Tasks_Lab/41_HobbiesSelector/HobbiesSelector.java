import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class HobbiesSelector {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Hobbies Selector");

        // Create a JLabel to display selected hobbies
        JLabel selectedHobbiesLabel = new JLabel("Selected Hobbies: None");

        // Create checkboxes for different hobbies
        JCheckBox readingCheckbox = new JCheckBox("Reading");
        JCheckBox travelingCheckbox = new JCheckBox("Traveling");
        JCheckBox cookingCheckbox = new JCheckBox("Cooking");
        JCheckBox gamingCheckbox = new JCheckBox("Gaming");

        // List to hold selected hobbies
        ArrayList<String> selectedHobbies = new ArrayList<>();

        // Create an ItemListener to update selected hobbies
        ItemListener itemListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                JCheckBox source = (JCheckBox) e.getSource();
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    selectedHobbies.add(source.getText());
                } else {
                    selectedHobbies.remove(source.getText());
                }
                updateLabel();
            }

            // Method to update the JLabel with selected hobbies
            private void updateLabel() {
                if (selectedHobbies.isEmpty()) {
                    selectedHobbiesLabel.setText("Selected Hobbies: None");
                } else {
                    selectedHobbiesLabel.setText("Selected Hobbies: " + String.join(", ", selectedHobbies));
                }
            }
        };

        // Add the ItemListener to the checkboxes
        readingCheckbox.addItemListener(itemListener);
        travelingCheckbox.addItemListener(itemListener);
        cookingCheckbox.addItemListener(itemListener);
        gamingCheckbox.addItemListener(itemListener);

        // Create a JPanel and add checkboxes to it
        JPanel checkBoxPanel = new JPanel();
        checkBoxPanel.add(readingCheckbox);
        checkBoxPanel.add(travelingCheckbox);
        checkBoxPanel.add(cookingCheckbox);
        checkBoxPanel.add(gamingCheckbox);

        // Set layout for the main frame and add components
        frame.setLayout(new BorderLayout());
        frame.add(checkBoxPanel, BorderLayout.CENTER);
        frame.add(selectedHobbiesLabel, BorderLayout.SOUTH);

        // Set frame properties
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
