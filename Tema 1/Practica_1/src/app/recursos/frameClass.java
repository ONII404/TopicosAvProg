package app.recursos;

// Librerias Importadas para el manejo de Interfaces Graficas
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
    public class frameClass extends JFrame{
    
        // Constructor de la Clase frameClass
        public frameClass(){
            super("Esto es una Ventana Vacia: ");
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            this.setLayout(null);
            this.setSize(700, 500);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            
        }
    }
