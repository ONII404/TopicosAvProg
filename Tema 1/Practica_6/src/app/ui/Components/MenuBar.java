package app.ui.Components;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRadioButtonMenuItem;

import java.awt.Color;

public class MenuBar extends JMenuBar {
    Color Dark = new Color(50, 50, 50);


    public MenuBar() {
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
        // ActionBtn.setRolloverEnabled(true);
        add(ActionBtn);
        ButtonGroup buttonGroup = new ButtonGroup();

        JRadioButtonMenuItem menuRaBtn = new JRadioButtonMenuItem("Suma");
        JRadioButtonMenuItem menuRaBtn2 = new JRadioButtonMenuItem("Resta");
        JRadioButtonMenuItem menuRaBtn3 = new JRadioButtonMenuItem("Multiplicación");
        JRadioButtonMenuItem menuRaBtn4 = new JRadioButtonMenuItem("División");
        JRadioButtonMenuItem menuRaBtn5 = new JRadioButtonMenuItem("Potencia");

        buttonGroup.add(menuRaBtn);
        buttonGroup.add(menuRaBtn2);
        buttonGroup.add(menuRaBtn3);
        buttonGroup.add(menuRaBtn4);
        buttonGroup.add(menuRaBtn5);
        ActionBtn.add(menuRaBtn);
        ActionBtn.add(menuRaBtn2);
        ActionBtn.add(menuRaBtn3);
        ActionBtn.add(menuRaBtn4);
        ActionBtn.add(menuRaBtn5);
    }

    private void addOptionsMenu() {
        JMenu OptionsBtn = new JMenu();
        add(OptionsBtn);
        OptionsBtn.setText("Options");
        OptionsBtn.setForeground(Color.white);

        JCheckBoxMenuItem menuChkBtn = new JCheckBoxMenuItem("1 decimal");
        JCheckBoxMenuItem menuChkBtn2 = new JCheckBoxMenuItem("2 decimales");
        JCheckBoxMenuItem menuChkBtn3 = new JCheckBoxMenuItem("Redondeo");

        OptionsBtn.add(menuChkBtn);
        OptionsBtn.add(menuChkBtn2);
        OptionsBtn.add(menuChkBtn3);
    }
}
