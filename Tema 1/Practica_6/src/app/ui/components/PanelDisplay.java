package app.ui.components;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 
 * @author ONII404
 */

public class PanelDisplay extends JPanel {

    static int jobTo = 0;

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
                this.createSuma();
                break;
            default:
                this.noOperation();
                break;
        }
    }

    private void createSuma() {
        JLabel preNums = new JLabel("¿Cuantos numeros desea sumar?");
        preNums.setBounds(3, 5, 250, 15);
        preNums.setBackground(Color.green);
        preNums.setForeground(Color.white);
        preNums.setVisible(true);
        add(preNums);

        JLabel nums = new JLabel("3");
        nums.setBounds(100, 50, 100, 50);
        nums.setFont(arial(50, ABORT));
        nums.setForeground(Color.white);
        nums.setHorizontalAlignment(JTextField.CENTER);
        nums.setVisible(true);
        add(nums);

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
