package app.recursos;

// Librerias Importadas para el manejo de Interfaces Graficas
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
public class frameClass extends JFrame {

    // Constructor de la Clase frameClass
    public frameClass() {
        super("Esto es una Ventana Vacia: "); // Titulo de la Ventana

        // Cuando se cierra la Ventana se termina la Aplicacion
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // definimos el diseño(layout) de la ventana
        this.setLayout(null);
        // definimos el tamaño de la ventana
        this.setSize(700, 500);
        // definimos la posicion de la ventana(centrada)
        this.setLocationRelativeTo(null);

    }
}
