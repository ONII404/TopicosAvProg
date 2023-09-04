package app.ui.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;

public class Key extends JButton {

    Font arial = new Font("Arial", Font.BOLD, 15);
    Insets insets = new Insets(0, 0, 0, 0);

    public Key() {
        super();
        this.setBackground(Color.darkGray);
        this.setForeground(Color.white);
        this.setBorderPainted(false);
        this.setFocusPainted(false);
        this.setFont(arial);
        this.setMargin(insets);
    }

}
