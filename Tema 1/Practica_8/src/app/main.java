package app;

import app.components.gui;

/**
 *
 * @author ONII404
 */
public class main {

    public static void main(String[] args) {

        // Invocamos el metodo que crea la ventana
        createAndShowGUI();

    }

    public static void createAndShowGUI() {

        // Instanciamos la clase gui
        gui objMainWIndows = new gui();
        objMainWIndows.setVisible(true); // Hacemos visible la ventana

    }

}
