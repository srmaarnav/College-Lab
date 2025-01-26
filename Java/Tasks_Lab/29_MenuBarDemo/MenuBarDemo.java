import javax.swing.*;
import java.awt.event.*;

public class MenuBarDemo {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Menu Bar Demo");

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create File and Edit menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items for the File menu
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        // Create menu items for the Edit menu
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");

        // Add menu items to the File menu
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        // Add menu items to the Edit menu
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);

        // Add the menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Add action listeners for menu items
        openMenuItem.addActionListener(e -> System.out.println("Open selected"));
        saveMenuItem.addActionListener(e -> System.out.println("Save selected"));
        exitMenuItem.addActionListener(e -> System.exit(0));
        
        cutMenuItem.addActionListener(e -> System.out.println("Cut selected"));
        copyMenuItem.addActionListener(e -> System.out.println("Copy selected"));
        pasteMenuItem.addActionListener(e -> System.out.println("Paste selected"));

        // Programmatically enable and disable menu items
        saveMenuItem.setEnabled(false);  // Disable the "Save" menu item initially

        // Simulate enabling the "Save" menu item after some action (e.g., file is modified)
        Timer timer = new Timer(5000, e -> {
            saveMenuItem.setEnabled(true);  // Enable the "Save" menu item after 5 seconds
        });
        timer.setRepeats(false);
        timer.start();

        // Set JFrame properties
        frame.setSize(300, 200);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
}
