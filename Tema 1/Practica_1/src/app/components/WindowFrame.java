package app.components;

import javax.swing.WindowConstants;
import javax.swing.JFrame;

/**
 *
 * @author onnx
 */
public class WindowFrame extends JFrame{

    public WindowFrame() {
        super("Esto es una Ventana Vacia: "); // Titulo de la Ventana
        // definimos el tamaño de la ventana
        this.setSize(700, 500);
        // definimos el diseño(layout) de la ventana
        this.setLayout(null);
        // definimos la posicion de la ventana(centrada)
        this.setLocationRelativeTo(null);
        // Cuando se cierra la Ventana se termina la Aplicacion
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
