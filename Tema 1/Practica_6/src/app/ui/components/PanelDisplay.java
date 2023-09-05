package app.ui.components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author ONII404
 */

public class PanelDisplay extends JPanel {

    static int jobTo = 1;

    private Font arial(int size, int type) {
        return new Font("Arial", Font.BOLD, size);
    }

    public PanelDisplay() {
        super();
        this.setBounds(0, 19, 300, 130);
        this.setLayout(null);
        this.setBackground(Color.darkGray);
        this.initComponents(jobTo);
        this.setVisible(true);
    }

    private void initComponents(int j) {
        switch (j) {
            case 1:
                this.addSuma();
                break;
            default:
                this.noOperation();
                break;
        }
    }

    private void addSuma() {
        DisplayContent suma = new DisplayContent();
        suma.createSuma();

        for (JLabel label : suma.createSuma()) {
            this.add(label);
        }
    }

    private void noOperation() {
        JLabel noOperation = new JLabel("No hay operacion");
        noOperation.setBounds(3, 5, 250, 50);
        noOperation.setFont(arial(25, ABORT));
        noOperation.setForeground(Color.white);
        noOperation.setVisible(true);
        add(noOperation);
    }

}
