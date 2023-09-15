package app.components;

// Librerias Importadas para el manejo de la interfaz grafica
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
public class WindowElements extends JFrame {

    public WindowElements() {
        super("Suma de dos numeros"); // Titulo de la Ventana
        // Definimos el tamaño de la ventana
        this.setSize(600, 400);
        // Definimos el diseño(Layout) de la ventana
        this.setLayout(null);
        // Definimos la posicion de la ventana en el centro de la pantalla
        this.setLocationRelativeTo(null);
        // Cuando se cierra la ventana se termina la ejecucion del programa
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
         * Creacion de los Objetos de la Clase JLabel
         * 
         */

        // instanciamos un objeto de la clase JLabel
        JLabel objTagX = new JLabel("Numero 1.. ");
        // Definimos la posicion del objeto en la ventana
        objTagX.setBounds(10, 30, 200, 30);
        add(objTagX); // Agregamos el objeto a la ventana

        JLabel objTagY = new JLabel("Numero 2..");
        objTagY.setBounds(10, 60, 200, 30);
        add(objTagY);

        JLabel objTagZ = new JLabel("El resultado es..");
        objTagZ.setBounds(10, 90, 200, 30);
        add(objTagZ);

        JLabel objReslut = new JLabel("...");
        objReslut.setBounds(200, 90, 200, 30);
        add(objReslut);

        /*
         * Creacion de los Objetos de la Clase JTextField
         * 
         */

        JTextField objJTextFieldX = new JTextField("");
        objJTextFieldX.setBounds(200, 30, 200, 30);
        add(objJTextFieldX);

        JTextField objJTextFieldY = new JTextField("");
        objJTextFieldY.setBounds(200, 60, 200, 30);
        add(objJTextFieldY);

        /*
         * Creacion de los Objetos de la Clase JButton
         * 
         */

        JButton objButtonSuma = new JButton("Sumar");
        objButtonSuma.setBounds(10, 200, 100, 30);
        add(objButtonSuma);

        JButton objButtonFin = new JButton("Terminar");
        objButtonFin.setBounds(150, 200, 100, 30);
        add(objButtonFin);

        JButton objButtonClean = new JButton("Limpiar");
        objButtonClean.setBounds(280, 200, 100, 30);
        add(objButtonClean);
    }
}
