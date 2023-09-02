package app.ui.Components;

import java.awt.Color;
import javax.swing.JPanel;

public class PanelKeys extends JPanel {

    public PanelKeys() {
        super();
        this.setBounds(0, 150, 300, 313);
        this.setLayout(null);
        this.setBackground(Color.white);
        this.setVisible(true);

        PanelBtnA objPanelBtnA = new PanelBtnA();
        this.add(objPanelBtnA);

        PanelBtnB objPanelBtnB = new PanelBtnB();
        this.add(objPanelBtnB);
    }
}