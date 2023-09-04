package app.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import app.ui.Components.PanelDisplay;
import app.ui.Components.PanelKeys;
import app.ui.Components.MenuBar;

/**
 * 
 * @author ONII404
 */

public class MainWIndow extends JFrame {

    public MainWIndow() {
        super("Calculadora By ONII404");
        this.setSize(300, 487);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
    }

    private void initComponents() {
        addMenuBar();
        addDisplay();
        addPanelKeys();
    }

    private void addMenuBar() {
        MenuBar objMenuBar = new MenuBar();
        this.getContentPane().add(objMenuBar);
        objMenuBar.revalidate();
        objMenuBar.repaint();
    }

    private void addDisplay() {
        PanelDisplay objDisplayPanel = new PanelDisplay();
        this.getContentPane().add(objDisplayPanel);
        objDisplayPanel.revalidate();
        objDisplayPanel.repaint();
    }

    private void addPanelKeys() {
        PanelKeys objPanelKeys = new PanelKeys();
        this.getContentPane().add(objPanelKeys);
        objPanelKeys.revalidate();
        objPanelKeys.repaint();
    }

}
