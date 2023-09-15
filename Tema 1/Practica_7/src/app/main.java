package app;

import app.components.gui;

/**
 *
 * @author ONII404
 */
public class main {

    public static void main(String[] args) {

        // arrancamos la interfaz grafica
        createAndShowGUI();
    }

    public static void createAndShowGUI() {
        // Instanciamos la interfaz grafica
        gui objMainWIndows = new gui();
        objMainWIndows.setVisible(true); // La hacemos visible
    }

}
