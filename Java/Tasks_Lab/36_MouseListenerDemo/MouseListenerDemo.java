import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;

public class MouseListenerDemo {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Mouse Listener Demo");

        // Create a JLabel to display messages
        JLabel label = new JLabel("Interact with the panel!");

        // Create a JPanel
        JPanel panel = new JPanel();

        // Add a MouseAdapter to handle mouse events
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                label.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("Mouse Entered the panel!");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("Mouse Exited the panel!");
            }
        });

        // Set the layout and add components
        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(label, BorderLayout.SOUTH);

        // Set frame properties
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
