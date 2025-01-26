import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ConfirmOnClose {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Confirm on Close");

        // Add a WindowListener to show a confirmation dialog on close
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int response = JOptionPane.showConfirmDialog(
                        frame,
                        "Are you sure you want to close the window?",
                        "Confirm Exit",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE
                );

                if (response == JOptionPane.YES_OPTION) {
                    frame.dispose();  // Close the frame
                } // If NO_OPTION, do nothing, and the window remains open
            }
        });

        // Set frame properties
        frame.setSize(300, 200);  // Set window size
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);  // Prevent default close operation
        frame.setVisible(true);  // Make the frame visible
    }
}
