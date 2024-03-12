package UI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginPage {

    public LoginPage () {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.decode("#ded9ee"));
        frame.pack();
        frame.setVisible(true);

        JPanel panel = new JPanel();
    }
}
