package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPage {


    public LoginPage () {
        JFrame frame = new JFrame();
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        JPanel panel = new JPanel(new GridBagLayout());
        frame.add(panel);

        composingPanel(panel);
    }

    private void composingPanel(JPanel panel) {
        JLabel libraryName = new JLabel("Gray Java Library");
        libraryName.setBounds(1200, 450, 300, 100);
        libraryName.setFont(new Font("Arial", Font.BOLD, 25));
        JLabel username = new JLabel("Username");
        username.setBounds(1250, 500, 150, 100);
        username.setFont(new Font("serif", Font.LAYOUT_LEFT_TO_RIGHT, 15));


        panel.setLayout(null);
        panel.add(libraryName);
        panel.add(username);
        panel.setBackground(Color.decode("#ded9ee"));
    }
}
