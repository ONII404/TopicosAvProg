package app.ui.Components;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PActBtns extends JPanel{

    
    public PActBtns() {
        this.setLayout(null);
        this.setSize(80, 300);
        this.setLocation(221, 150);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.initComponents();
        
    }
    
    private void initComponents() {
        JButton btnBack = new JButton("<-");
        JButton btnCE = new JButton("CE");
        JButton btnResult = new JButton("=");
        this.add(btnBack);
        this.add(btnCE);
        this.add(btnResult);
        btnBack.setBounds(0, 0, 80, 75);
        btnCE.setBounds(0, 75, 80, 75);
        btnResult.setBounds(0, 150, 80, 150);
    }
}
