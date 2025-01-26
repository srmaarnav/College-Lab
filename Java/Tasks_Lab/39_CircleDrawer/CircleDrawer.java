import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class CircleDrawer {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Circle Drawer");

        // Create a JPanel to draw circles
        DrawingPanel panel = new DrawingPanel();

        // Add a MouseAdapter to capture mouse clicks and draw circles
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.addCircle(e.getX(), e.getY());
            }
        });

        // Set frame properties
        frame.add(panel);
        frame.setSize(600, 400);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}

class DrawingPanel extends JPanel {
    private final ArrayList<Point> circles = new ArrayList<>();

    public void addCircle(int x, int y) {
        circles.add(new Point(x, y));
        repaint();  // Repaint the panel to update the drawing
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        for (Point p : circles) {
            g.fillOval(p.x - 15, p.y - 15, 30, 30);  // Draw circle with center at mouse click
        }
    }
}
