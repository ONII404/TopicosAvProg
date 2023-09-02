package app.ui.Components;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBtnB extends JPanel{

    GridLayout gridLayout = new GridLayout(3, 1);
    
    public PanelBtnB() {
        super();
        this.setBounds(220, 0, 80, 300);
        this.setLayout(null);
        // this.setLayout(gridLayout);
        this.setBackground(Color.green);
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
