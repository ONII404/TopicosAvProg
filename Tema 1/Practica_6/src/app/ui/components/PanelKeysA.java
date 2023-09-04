package app.ui.components;

import java.awt.GridLayout;
import javax.swing.JPanel;

public class PanelKeysA extends JPanel{
    GridLayout gridLayout = new GridLayout(4, 3, 1, 1);

    public PanelKeysA(){
        super();
        this.setBounds(0, 150, 220, 300);
        this.setVisible(true);
        this.setLayout(gridLayout);
        this.createBtn();
    }

    private void createBtn(){

        for (int i = 0; i < 12; i++) {
            Key btn = new Key();
            this.add(btn);

            switch (i) {
                case 0:
                    btn.setText("7");
                    break;
                case 1:
                    btn.setText("8");
                    break;
                case 2:
                    btn.setText("9");
                    break;
                case 3:
                    btn.setText("4");
                    break;
                case 4:
                    btn.setText("5");
                    break;
                case 5:
                    btn.setText("6");
                    break;
                case 6:
                    btn.setText("1");
                    break;
                case 7:
                    btn.setText("2");
                    break;
                case 8:
                    btn.setText("3");
                    break;
                case 9:
                    btn.setText("+/-");
                    break;
                case 10:
                    btn.setText("0");
                    break;
                case 11:
                    btn.setText(".");
                    break;
                default:
                    break;
            }
        }
    }
}
