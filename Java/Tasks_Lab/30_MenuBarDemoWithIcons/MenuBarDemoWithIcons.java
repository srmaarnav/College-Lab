import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuBarDemoWithIcons {

    public static void main(String[] args) {
        // Create a JFrame container
        JFrame frame = new JFrame("Menu Bar Demo with Icons");

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create File and Edit menus
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");

        // Create menu items for the File menu
        JMenuItem openMenuItem = new JMenuItem("Open", createIcon("open_icon.png"));
        JMenuItem saveMenuItem = new JMenuItem("Save", createIcon("save_icon.png"));
        JMenuItem exitMenuItem = new JMenuItem("Exit", createIcon("exit_icon.png"));

        // Create menu items for the Edit menu
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");

        // Set mnemonics for keyboard shortcuts
        openMenuItem.setMnemonic(KeyEvent.VK_O);  // Alt + O
        saveMenuItem.setMnemonic(KeyEvent.VK_S);  // Alt + S
        exitMenuItem.setMnemonic(KeyEvent.VK_X);  // Alt + X
        cutMenuItem.setMnemonic(KeyEvent.VK_T);   // Alt + T
        copyMenuItem.setMnemonic(KeyEvent.VK_C);  // Alt + C
        pasteMenuItem.setMnemonic(KeyEvent.VK_P); // Alt + P

        // Set accelerators for keyboard shortcuts
        openMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));  // Ctrl + O
        saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));  // Ctrl + S
        exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));  // Ctrl + X
        cutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));   // Ctrl + T
        copyMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));  // Ctrl + C
        pasteMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, InputEvent.CTRL_DOWN_MASK)); // Ctrl + P

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
        frame.setSize(400, 300);  // Set window size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close on exit
        frame.setVisible(true);  // Make the frame visible
    }
    // Helper method to create an ImageIcon with resized images
    private static ImageIcon createIcon(String path) {
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage(); // get the Image from ImageIcon
        Image scaledImg = img.getScaledInstance(16, 16, Image.SCALE_SMOOTH); // resize image to fit in menu
        return new ImageIcon(scaledImg); // return a new ImageIcon with the resized image
    }
}
