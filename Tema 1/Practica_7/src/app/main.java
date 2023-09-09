package app;

import javax.swing.SwingUtilities;

import app.components.gui;

/**
 *
 * @author onnx
 */
public class main {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    public static void createAndShowGUI() {
        gui objMainWIndows = new gui();
        objMainWIndows.setVisible(true);

    }
    
}
