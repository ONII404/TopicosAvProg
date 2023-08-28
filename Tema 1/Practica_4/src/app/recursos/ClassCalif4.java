package app.recursos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
public class ClassCalif4 extends JFrame{

    // Creacion de los Objetos de la Clase JLabel
    JLabel objTagCalif1 = new JLabel("Capturar calificacion  1...");
    JLabel objTagCalif2 = new JLabel("Capturar calificacion  2...");
    JLabel objTagCalif3 = new JLabel("Capturar calificacion  3...");
    JLabel objTagCalif4 = new JLabel("Capturar calificacion  4...");
    JLabel objTagZ = new JLabel("El resultado  es...");
    JLabel objTagResult = new JLabel("...");

    // Creacion de los Objetos de la Clase JTextField
    JTextField objTagBox1 = new JTextField("");
    JTextField objTagBox2 = new JTextField("");
    JTextField objTagBox3 = new JTextField("");
    JTextField objTagBox4 = new JTextField("");

    //  Creacion de los Objetos de la Clase JButton
    JButton objBottomExec = new JButton("Promedio sobre 4 calificaciones ");
    JButton objBottomEnd = new JButton("Terminar");
    JButton objBottomClean = new JButton("Limpiar");

    // Constructor de la Clase
     public ClassCalif4() {
        // Tirulo de la Ventana
        super("Sistema promedio sobre 4 calificaciones");

        // Agregamos los Objetos a la Ventana
        this.add(objTagCalif1);
        this.add(objTagCalif2);
        this.add(objTagCalif3);
        this.add(objTagCalif4);
        this.add(objTagZ);
        this.add(objTagResult);
        this.add(objTagBox1);
        this.add(objTagBox2);
        this.add(objTagBox3);
        this.add(objTagBox4);
        this.add(objBottomExec);
        this.add(objBottomEnd);
        this.add(objBottomClean);

        //  Mapear los Objetos en la Ventana
        objTagCalif1.setBounds(10, 30, 200, 30);
        objTagCalif2.setBounds(10, 60, 200, 30);
        objTagCalif3.setBounds(10, 90, 200, 30);
        objTagCalif4.setBounds(10, 120, 200, 30);
        objTagZ.setBounds(10, 150, 200, 30);
        objTagResult.setBounds(200, 150, 200, 30);
        objTagBox1.setBounds(200, 30, 200, 30);
        objTagBox2.setBounds(200, 60, 200, 30);
        objTagBox3.setBounds(200, 90, 200, 30);
        objTagBox4.setBounds(200, 120, 200, 30);

        objBottomExec.setBounds(10, 200, 100, 30);
        objBottomEnd.setBounds(150, 200, 100, 30);
        objBottomClean.setBounds(280, 200, 100, 30);

        // Configuraciones de la Ventana
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
     }
}
