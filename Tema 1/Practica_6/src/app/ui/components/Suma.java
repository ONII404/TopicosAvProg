package app.ui.components;

import javax.swing.JLabel;

public class Suma {
    private JLabel pregunta;
    private JLabel numOperations;

    public Suma() {
        this.pregunta = new JLabel("¿Cuantos numeros desea sumar?");
        this.numOperations = new JLabel("3");
    }

}
