package app.ui.components;

import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import app.logic.MenuEvents;

/**
 * 
 * @author ONII404
 */

public class BarMenu extends JMenuBar {
    Color barMenuDark = new Color(50, 50, 50);

    // ? Constructor de la Clase
    public BarMenu() {
        this.setBounds(0, 0, 300, 19);
        this.setBackground(barMenuDark);
        this.initComponents();
        this.setVisible(true);
    }

    // ? Metodo para agregar los componentes
    private void initComponents() {
        addActionMenu();
        addOptionsMenu();
    }

    // ? Metodo para agregar el menu de Acciones
    private void addActionMenu() {
        JMenu actionMenu = new JMenu();
        actionMenu.setText("Actions");
        actionMenu.setForeground(Color.white);
        add(actionMenu);

        // ? Creamos un grupo de botones para que solo se pueda seleccionar uno
        ButtonGroup buttonGroup = new ButtonGroup();

        // ? Creamos los botones de radio y los agregamos al grupo
        for (int i = 0; i < 6; i++) {
            JRadioButtonMenuItem menuRaBtn = new JRadioButtonMenuItem();
            buttonGroup.add(menuRaBtn);
            actionMenu.add(menuRaBtn);

            // ? Creamos un switch para asignar el texto y el evento a cada boton
            switch (i) {
                case 0:
                    menuRaBtn.setText("Suma");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
                case 1:
                    menuRaBtn.setText("Resta");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
                case 2:
                    menuRaBtn.setText("Multiplicación");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
                case 3:
                    menuRaBtn.setText("División");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
                case 4:
                    menuRaBtn.setText("Potencia");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
                case 5:
                    menuRaBtn.setSelected(true);
                    menuRaBtn.setText("Nada");
                    menuRaBtn.addActionListener(MenuEvents.getActionListener(i));
                    break;
            }
        }
    }

    // ? Metodo para agregar el menu de Opciones
    private void addOptionsMenu() {
        JMenu OptionsBtn = new JMenu();
        add(OptionsBtn);
        OptionsBtn.setText("Options");
        OptionsBtn.setForeground(Color.white);

        // ? Creamos los botones de check
        for (int i = 0; i < 2; i++) {
            JCheckBoxMenuItem menuChkBtn = new JCheckBoxMenuItem();
            OptionsBtn.add(menuChkBtn);

            // ? Creamos un switch para asignar el texto y el evento a cada boton
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
