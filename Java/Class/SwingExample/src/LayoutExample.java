import java.awt.*;
import javax.swing.*;
public class LayoutExample {
    public static void main(String[] args) {
        new LayoutExample();
    }

    public LayoutExample() {
        JFrame frame = new JFrame("Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        panel.add(new JLabel("First Name:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Last Name:"));
        panel.add(new JTextField());
        panel.add(new JLabel("Email:"));
        panel.add(new JTextField());

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}