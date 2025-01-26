import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;

public class KeystrokeCapture {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Keystroke Capture");

        // Create a JTextArea to display keystrokes
        JTextArea textArea = new JTextArea(10, 30);
        textArea.setEditable(false);  // Make the text area non-editable by the user

        // Add a KeyListener to capture keystrokes
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                textArea.append("Key Typed: " + e.getKeyChar() + "\n");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                textArea.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
            }
        });

        // Add the text area to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set layout and add the scroll pane to the frame
        frame.setLayout(new BorderLayout());
        frame.add(scrollPane, BorderLayout.CENTER);

        // Set frame properties
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible

        // Set focus to the frame to capture keystrokes
        frame.requestFocus();
    }
}
