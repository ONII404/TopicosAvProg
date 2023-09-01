package app.ui.Components;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * 
 * @author ONII404
 */
public class PNumBtns extends JPanel {

    GridLayout gridLayout = new GridLayout(4, 3, 1, 1);

    public PNumBtns() {
        this.setLayout(null);
        this.setSize(220, 300);
        this.setLocation(0, 150);
        this.setBackground(Color.gray);
        this.setVisible(true);
        this.setLayout(gridLayout);
        this.initComponents();
    }

    private void initComponents() {
        JButton[] buttons = new JButton[12];

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(String.valueOf(i));
            this.add(buttons[i]);
        }
        buttons[0].setText("7");
        buttons[1].setText("8");
        buttons[2].setText("9");
        buttons[3].setText("4");
        buttons[4].setText("5");
        buttons[5].setText("6");
        buttons[6].setText("1");
        buttons[7].setText("2");
        buttons[8].setText("3");
        buttons[9].setText("+/-");
        buttons[10].setText("0");
        buttons[11].setText(".");

    }

}
