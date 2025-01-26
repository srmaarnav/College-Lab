import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        // Create a frame
        Frame frame = new Frame("AWT Example");

        // Create a label
        Label label = new Label("Enter text: ");
        label.setBounds(50, 50, 100, 30);

        // Create a text field
        TextField textField = new TextField();
        textField.setBounds(150, 50, 200, 30);

        // Create a button
        Button button = new Button("Submit");
        button.setBounds(150, 100, 100, 30);

        // Create a result label
        Label resultLabel = new Label();
        resultLabel.setBounds(150, 150, 200, 30);

        // Button click event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                resultLabel.setText("You entered: " + textField.getText());
            }
        });

        // Add components to the frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(resultLabel);

        // Set layout to null
        frame.setLayout(null);

        // Set the size and visibility of the frame
        frame.setSize(400, 250);
        frame.setVisible(true);

        // Close the frame when the user closes it
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }
}
