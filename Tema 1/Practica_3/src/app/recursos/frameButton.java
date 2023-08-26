package app.recursos;

// Librerias Importadas para el manejo de Interfaces Graficas
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
public class frameButton extends JFrame {

    // Creacion de los Objetos de la Clase JLabel
    JLabel objTagX = new JLabel("Numero 1.. ");
    JLabel objTagY = new JLabel("Numero 2..");
    JLabel objTagZ = new JLabel("El resultado es..");
    JLabel objReslut = new JLabel("...");

    // Creacion de los Objetos de la Clase JTextField
    JTextField objJTextFieldX = new JTextField("");
    JTextField objJTextFieldY = new JTextField("");

    // Creacion de los Objetos de la Clase JButton
    JButton objButtonSuma = new JButton("Sumar");
    JButton objButtonFin = new JButton("Terminar");
    JButton objButtonClean = new JButton("Limpiar");

    // Constructor de la Clase frameButton
    public frameButton() {
        // Titulo de la Ventana
        super("Suma de dos numeros");
        
        // Agregamos los Objetos a la Ventana
        this.add(objTagX);
        this.add(objTagY);
        this.add(objTagZ);
        this.add(objReslut);
        this.add(objJTextFieldX);
        this.add(objJTextFieldY);
        this.add(objButtonSuma);
        this.add(objButtonFin);
        this.add(objButtonClean);

        // Posicion de los Objetos en la Ventana
        objTagX.setBounds(10, 30, 200, 30);
        objTagY.setBounds(10, 60, 200, 30);
        objTagZ.setBounds(10, 90, 200, 30);
        objReslut.setBounds(200, 90, 200, 30);
        objJTextFieldX.setBounds(200, 30, 200, 30);
        objJTextFieldY.setBounds(200, 60, 200, 30);
        objButtonSuma.setBounds(10, 200, 100, 30);
        objButtonFin.setBounds(150, 200, 100, 30);
        objButtonClean.setBounds(280, 200, 100, 30);

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

    }
}
