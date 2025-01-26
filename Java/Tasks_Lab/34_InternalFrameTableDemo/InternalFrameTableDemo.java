import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InternalFrameTableDemo {

    public static void main(String[] args) {
        // Create the main JFrame container
        JFrame frame = new JFrame("Internal Frame with Table");

        // Set the layout and size for the main frame
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 400);

        // Create a JDesktopPane to hold internal frames
        JDesktopPane desktopPane = new JDesktopPane();

        // Create an internal frame with a title
        JInternalFrame internalFrame = new JInternalFrame("Student Grades", true, true, true, true);
        internalFrame.setSize(400, 300);
        internalFrame.setClosable(true);
        internalFrame.setMaximizable(true);
        internalFrame.setResizable(true);

        // Create the JTable with student data
        String[] columnNames = {"Name", "Grade"};
        Object[][] data = {
            {"John", "A"},
            {"Emma", "B"},
            {"Michael", "C"},
            {"Sophia", "B+"},
            {"James", "A-"}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);
        
        // Add the table to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(table);
        
        // Add the JScrollPane containing the JTable to the internal frame
        internalFrame.add(scrollPane, BorderLayout.CENTER);
        
        // Make the internal frame visible
        internalFrame.setVisible(true);

        // Add the internal frame to the desktop pane
        desktopPane.add(internalFrame);

        // Add the desktop pane to the main frame
        frame.add(desktopPane, BorderLayout.CENTER);

        // Set the frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
