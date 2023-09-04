package app.ui.components;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;

/**
 * 
 *  @author ONII404
 */

public class BarMenu extends JMenuBar {
    Color Dark = new Color(50, 50, 50);

    public BarMenu() {
        super();
        this.setBounds(0, 0, 300, 19);
        this.setVisible(true);
        this.setBackground(Dark);

        this.initComponents();
    }

    private void initComponents() {
        addActionMenu();
        addOptionsMenu();
    }

    private void addActionMenu() {
        JMenu ActionBtn = new JMenu();
        ActionBtn.setText("Actions");
        ActionBtn.setForeground(Color.white);
        add(ActionBtn);
        ButtonGroup buttonGroup = new ButtonGroup();

        for (int i = 0; i < 6; i++) {
            JRadioButtonMenuItem menuRaBtn = new JRadioButtonMenuItem();
            buttonGroup.add(menuRaBtn);
            ActionBtn.add(menuRaBtn);

            switch (i) {
                case 0:
                    menuRaBtn.setText("Suma");
                    break;
                case 1:
                    menuRaBtn.setText("Resta");
                    break;
                case 2:
                    menuRaBtn.setText("Multiplicación");
                    break;
                case 3:
                    menuRaBtn.setText("División");
                    break;
                case 4:
                    menuRaBtn.setText("Potencia");
                    break;
                case 5:
                    menuRaBtn.setText("Nada");
                    break;
                default:
                    break;
            }
        }
    }

    private void addOptionsMenu() {
        JMenu OptionsBtn = new JMenu();
        add(OptionsBtn);
        OptionsBtn.setText("Options");
        OptionsBtn.setForeground(Color.white);

        for (int i = 0; i < 2; i++) {
            JCheckBoxMenuItem menuChkBtn = new JCheckBoxMenuItem();
            OptionsBtn.add(menuChkBtn);

            switch (i) {
                case 0:
                    menuChkBtn.setText("2 decimales");
                    break;
                case 1:
                    menuChkBtn.setText("Numeros Negativos");
                    break;
                default:
                    break;
            }
        }
    }
}
