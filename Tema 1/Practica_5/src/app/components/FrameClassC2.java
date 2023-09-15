package app.components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 * 
 * @author: Loredo
 */

public class FrameClassC2 extends JFrame {

    public FrameClassC2() {
        // Titulo de la ventana
        super("Sistema promedio sobre 4 calificaciones (FrameClassC2)");

        // Crear objetos de JLabel
        JLabel Objeto_Etiqueta_C1 = new JLabel("Capturar calificacion  1...");
        JLabel Objeto_Etiqueta_C2 = new JLabel("Capturar calificacion  2...");
        JLabel Objeto_Etiqueta_C3 = new JLabel("Capturar calificacion  3...");
        JLabel Objeto_Etiqueta_C4 = new JLabel("Capturar calificacion  4...");
        JLabel Objeto_Etiqueta_Z = new JLabel("El resultado  es...");
        JLabel Objeto_Etiqueta_Result = new JLabel("...");

        // Crear objetos de JTextField
        JTextField Objeto_Caja_C1 = new JTextField("");
        JTextField Objeto_Caja_C2 = new JTextField("");
        JTextField Objeto_Caja_C3 = new JTextField("");
        JTextField Objeto_Caja_C4 = new JTextField("");

        // Crear objetos de JButton
        JButton Objeto_Boton_Promedio = new JButton("Promedio de 4 calificaciones ");
        JButton Objeto_Boton_Terminar = new JButton("Terminar");
        JButton Objeto_Boton_Limpiar = new JButton("Limpiar");

        // Agregar objetos a la ventana
        this.add(Objeto_Etiqueta_C1);
        this.add(Objeto_Etiqueta_C2);
        this.add(Objeto_Etiqueta_C3);
        this.add(Objeto_Etiqueta_C4);
        this.add(Objeto_Etiqueta_Z);
        this.add(Objeto_Etiqueta_Result);
        this.add(Objeto_Caja_C1);
        this.add(Objeto_Caja_C2);
        this.add(Objeto_Caja_C3);
        this.add(Objeto_Caja_C4);
        this.add(Objeto_Boton_Promedio);
        this.add(Objeto_Boton_Terminar);
        this.add(Objeto_Boton_Limpiar);

        // Posicion y tamaño de los objetos en la ventana
        Objeto_Etiqueta_C1.setBounds(10, 30, 200, 30);
        Objeto_Etiqueta_C2.setBounds(10, 60, 200, 30);
        Objeto_Etiqueta_C3.setBounds(10, 90, 200, 30);
        Objeto_Etiqueta_C4.setBounds(10, 120, 200, 30);
        Objeto_Etiqueta_Z.setBounds(10, 150, 200, 30);
        Objeto_Etiqueta_Result.setBounds(200, 150, 200, 30);
        Objeto_Caja_C1.setBounds(200, 30, 200, 30);
        Objeto_Caja_C2.setBounds(200, 60, 200, 30);
        Objeto_Caja_C3.setBounds(200, 90, 200, 30);
        Objeto_Caja_C4.setBounds(200, 120, 200, 30);
        Objeto_Boton_Promedio.setBounds(10, 200, 100, 30);
        Objeto_Boton_Terminar.setBounds(150, 200, 100, 30);
        Objeto_Boton_Limpiar.setBounds(280, 200, 100, 30);

        // propiedades de la ventana
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        // Eventos de los botones
        Objeto_Boton_Promedio.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                Double x = (
                    Double.valueOf(Objeto_Caja_C1.getText()) + 
                    Double.valueOf(Objeto_Caja_C2.getText()) + 
                    Double.valueOf(Objeto_Caja_C3.getText()) + 
                    Double.valueOf(Objeto_Caja_C4.getText())) / 4;

                Objeto_Etiqueta_Result.setText(String.valueOf(x));
                Objeto_Etiqueta_Z.setForeground(Color.BLACK);
            }

            //? Eventos de los botones cambio de color
            @Override
            public void mousePressed(MouseEvent me) {
                Objeto_Etiqueta_Z.setForeground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                Objeto_Etiqueta_Z.setForeground(Color.YELLOW);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                Objeto_Etiqueta_Z.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                Objeto_Etiqueta_Z.setForeground(Color.GREEN);
            }
        });
    }
}