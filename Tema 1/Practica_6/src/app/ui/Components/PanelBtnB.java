package app.ui.Components;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBtnB extends JPanel{

    // GridLayout gridLayout = new GridLayout(3, 1);
    
    public PanelBtnB() {
        super();
        this.setBounds(220, 0, 80, 300);
        this.setLayout(null);
        // this.setLayout(gridLayout);
        // this.setBackground(Color.LIGHT_GRAY);
        this.initComponents();
        this.setVisible(true);
        
    }
    
    private void initComponents() {
        createButtons();
    }

    private void createButtons() {


        for (int i = 0; i < 3; i++) {

            // JButton btn = new JButton();
            KeyButton btn = new KeyButton();
            this.add(btn);
            btn.setBackground(Color.gray);

            switch (i) {
                case 0:
                    btn.setText("<-");
                    btn.setBounds(0, 0, 80, 74);
                    break;
                    case 1:
                    btn.setText("CE");
                    btn.setBounds(0, 75, 80, 74);
                    break;
                    case 2:
                    btn.setText("=");
                    btn.setBounds(0, 150, 80, 149);
                    break;
                default:
                    break;
            }
        }
    }
}
