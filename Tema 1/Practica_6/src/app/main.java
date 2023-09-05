package app;

import javax.swing.SwingUtilities;

import app.ui.MainWIndow;

/**
 *
 * @author ONII404
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
        MainWIndow objMainWIndows = new MainWIndow();
        objMainWIndows.setVisible(true);

    }

}