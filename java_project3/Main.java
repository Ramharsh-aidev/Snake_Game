package java_project3;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main extends JFrame {
    Main() {
        super("Snake Game");
        initializeUI(); // Call to method that sets up the UI
    }

    private void initializeUI() {
        add(new Board()); // Adds the board to the window
        setSize(500, 500); // Set the window size
        setLocationRelativeTo(null); // Center the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensure the application exits on close
        setVisible(true); // Make the window visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main()); // Ensures the UI is created on the Event Dispatch Thread
    }
}
