
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SwingExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JLabel("Hello, Swing"));
        frame.pack();
        frame.setVisible(true);
    }
}
