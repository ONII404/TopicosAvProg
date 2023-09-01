package app.ui.Components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @autor ONII404
 */

public class ToolBar extends JPanel{

    public ToolBar() {
        this.setLayout(null);
        this.setSize(300, 20);
        this.setLocation(0, 0);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.initComponents();
    }

    private void initComponents() {
        
        String[] btnNames = {"Actions", "Options"};

        for (int i = 0; i < btnNames.length; i++) {
            JButton btn = new JButton(String.valueOf(btnNames[i]));
            this.add(btn);
            btn.setBounds(60 * i, 0, 60, 20);
            btn.setBackground(Color.gray);
            btn.setForeground(Color.white);
            btn.setBorderPainted(false);
            btn.setFocusPainted(false);
            Font fontArial = new Font("Arial", Font.BOLD, 10);
            btn.setFont(fontArial);
            Insets insets = new Insets(0, 0, 0, 0);
            btn.setMargin(insets);

            if (i == 0) {
                // Si es Boton de Acciones
            } else {
                // Si es Boton de Opciones
            }
        }
    }
}
