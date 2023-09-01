package app.ui;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import app.ui.Components.PActBtns;
import app.ui.Components.PNumBtns;
import app.ui.Components.ToolBar;

/**
 * 
 * @author ONII404
 */

public class MainWIndow extends JFrame {

    public MainWIndow() {
        super("Calculadora By ONII404");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(300, 487);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.initComponents();

    }

    private void initComponents() {
        PNumBtns objPanelButtons = new PNumBtns();
        this.getContentPane().add(objPanelButtons);

        PActBtns objPanelActButtons = new PActBtns();
        this.getContentPane().add(objPanelActButtons);
        
        ToolBar objToolBar = new ToolBar();
        this.getContentPane().add(objToolBar);

    }

}
