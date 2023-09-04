package app.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import app.ui.components.BarMenu;
import app.ui.components.PanelDisplay;
import app.ui.components.PanelKeysA;
import app.ui.components.PanelKeysB;

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
        BarMenu objMenuBar = new BarMenu();
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
        PanelKeysA objPanelBtnA = new PanelKeysA();
        this.getContentPane().add(objPanelBtnA);
        objPanelBtnA.revalidate();
        objPanelBtnA.repaint();

        PanelKeysB objPanelBtnB = new PanelKeysB();
        this.getContentPane().add(objPanelBtnB);
        objPanelBtnB.revalidate();
        objPanelBtnB.repaint();
    }

}
