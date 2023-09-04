package app.ui.components;

import java.awt.Color;
import javax.swing.JPanel;

/**
 * 
 * @author ONII404
 */

public class PanelKeysB extends JPanel {

    public PanelKeysB() {
        super();
        this.setBounds(220, 150, 80, 300);
        this.setLayout(null);
        this.createButtons();
        this.setVisible(true);

    }

    private void createButtons() {

        for (int i = 0; i < 3; i++) {
            Key btn = new Key();
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
                    // if (PanelDisplay.jobTo == 0) {
                    // btn.setText("GO");
                    // btn.setBounds(0, 150, 80, 149);
                    // } else {
                    // btn.setText("=");
                    // btn.setBounds(0, 150, 80, 149);
                    // }
                    break;
                default:
                    break;
            }
        }
    }
}
