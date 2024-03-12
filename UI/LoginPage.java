package UI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginPage {

    void test() {
        System.out.println("Hello");
    }

    public LoginPage () {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        frame.add(panel);

        composingPanel(panel);
    }

    private void composingPanel(JPanel panel) {
        panel.setBackground(Color.decode("#ded9ee"));
    }
}
