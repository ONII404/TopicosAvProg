package proyectocalificacionespromedio;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author
 */
public class Clase_Calificaciones_4 extends JFrame {
    // Creacion de los Objetos de la Clase JLabel

    // Constructor de la Clase
    public Clase_Calificaciones_4() {
        // Tirulo de la Ventana
        super("Sistema promedio sobre 4 calificaciones  ");

        JLabel objeto_etiqueta_c1 = new JLabel("Capturar calificacion  1...");
        JLabel objeto_etiqueta_c2 = new JLabel("Capturar calificacion  2...");
        JLabel objeto_etiqueta_c3 = new JLabel("Capturar calificacion  3...");
        JLabel objeto_etiqueta_c4 = new JLabel("Capturar calificacion  4...");
        JLabel objeto_etiqueta_z = new JLabel("El resultado  es...");
        JLabel objeto_etiqueta_respuesta = new JLabel("...");

        // Creacion de los Objetos de la Clase JTextField
        JTextField objeto_caja_c1 = new JTextField("");
        JTextField objeto_caja_c2 = new JTextField("");
        JTextField objeto_caja_c3 = new JTextField("");
        JTextField objeto_caja_c4 = new JTextField("");

        //  Creacion de los Objetos de la Clase JButton
        JButton objeto_boton_promedio_4 = new JButton("Promedio sobre 4 calificaciones ");
        JButton objeto_boton_terminar = new JButton("Terminar");
        JButton objeto_boton_limpiar = new JButton("Limpiar");

        // Agregamos los Objetos a la Ventana
        this.add(objeto_etiqueta_c1);
        this.add(objeto_etiqueta_c2);
        this.add(objeto_etiqueta_c3);
        this.add(objeto_etiqueta_c4);
        this.add(objeto_etiqueta_z);
        this.add(objeto_etiqueta_respuesta);
        this.add(objeto_caja_c1);
        this.add(objeto_caja_c2);
        this.add(objeto_caja_c3);
        this.add(objeto_caja_c4);
        this.add(objeto_boton_promedio_4);
        this.add(objeto_boton_terminar);
        this.add(objeto_boton_limpiar);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);

        //  Mapear los Objetos en la Ventana
        objeto_etiqueta_c1.setBounds(10, 30, 200, 30);
        objeto_etiqueta_c2.setBounds(10, 60, 200, 30);
        objeto_etiqueta_c3.setBounds(10, 90, 200, 30);
        objeto_etiqueta_c4.setBounds(10, 120, 200, 30);
        objeto_etiqueta_z.setBounds(10, 150, 200, 30);
        objeto_etiqueta_respuesta.setBounds(200, 150, 200, 30);
        objeto_caja_c1.setBounds(200, 30, 200, 30);
        objeto_caja_c2.setBounds(200, 60, 200, 30);
        objeto_caja_c3.setBounds(200, 90, 200, 30);
        objeto_caja_c4.setBounds(200, 120, 200, 30);

        objeto_boton_promedio_4.setBounds(10, 200, 100, 30);
        objeto_boton_terminar.setBounds(150, 200, 100, 30);
        objeto_boton_limpiar.setBounds(280, 200, 100, 30);

        // Configuraciones de la Ventana
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
    }

}
