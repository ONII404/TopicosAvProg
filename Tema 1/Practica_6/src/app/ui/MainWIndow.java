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

    private void addDisplay(){
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

    // private void addTolBar() {
    //     ToolBar objToolBar = new ToolBar();
    //     this.getContentPane().add(objToolBar);
    //     objToolBar.revalidate();
    //     objToolBar.repaint();
    // }

    // private void addPNumBtns() {
    //     PNumBtns objPNumBtns = new PNumBtns();
    //     this.getContentPane().add(objPNumBtns);
    //     objPNumBtns.revalidate();
    //     objPNumBtns.repaint();
    // }

    // private void addPActBtns() {
    //     PanelBtnA objPActBtns = new PanelBtnA();
    //     this.getContentPane().add(objPActBtns);
    //     objPActBtns.revalidate();
    //     objPActBtns.repaint();
    // }

    // private void addActionMenu() {
    //     ActionMenu objActionMenu = new ActionMenu();
    //     this.getContentPane().add(objActionMenu);
    //     objActionMenu.revalidate();
    //     objActionMenu.repaint();
    // }

}
