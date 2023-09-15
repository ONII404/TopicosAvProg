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
        JLabel objTagC1 = new JLabel("Capturar calificacion  1...");
        JLabel objTagC2 = new JLabel("Capturar calificacion  2...");
        JLabel objTagC3 = new JLabel("Capturar calificacion  3...");
        JLabel objTagC4 = new JLabel("Capturar calificacion  4...");
        JLabel objTagZ = new JLabel("El resultado  es...");
        JLabel objTagResult = new JLabel("...");

        // Crear objetos de JTextField
        JTextField objBoxC1 = new JTextField("");
        JTextField objBoxC2 = new JTextField("");
        JTextField objBoxC3 = new JTextField("");
        JTextField objBoxC4 = new JTextField("");

        // Crear objetos de JButton
        JButton objBottonProm = new JButton("Promedio de 4 calificaciones ");
        JButton objBottonEnd = new JButton("Terminar");
        JButton objBottonClean = new JButton("Limpiar");

        // Agregar objetos a la ventana
        this.add(objTagC1);
        this.add(objTagC2);
        this.add(objTagC3);
        this.add(objTagC4);
        this.add(objTagZ);
        this.add(objTagResult);
        this.add(objBoxC1);
        this.add(objBoxC2);
        this.add(objBoxC3);
        this.add(objBoxC4);
        this.add(objBottonProm);
        this.add(objBottonEnd);
        this.add(objBottonClean);

        // Posicion y tamaño de los objetos en la ventana
        objTagC1.setBounds(10, 30, 200, 30);
        objTagC2.setBounds(10, 60, 200, 30);
        objTagC3.setBounds(10, 90, 200, 30);
        objTagC4.setBounds(10, 120, 200, 30);
        objTagZ.setBounds(10, 150, 200, 30);
        objTagResult.setBounds(200, 150, 200, 30);
        objBoxC1.setBounds(200, 30, 200, 30);
        objBoxC2.setBounds(200, 60, 200, 30);
        objBoxC3.setBounds(200, 90, 200, 30);
        objBoxC4.setBounds(200, 120, 200, 30);
        objBottonProm.setBounds(10, 200, 100, 30);
        objBottonEnd.setBounds(150, 200, 100, 30);
        objBottonClean.setBounds(280, 200, 100, 30);

        // propiedades de la ventana
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);

        // Eventos de los botones
        objBottonProm.addMouseListener(new MouseListener() {
            public void mouseClicked(MouseEvent me) {
                Double x = (
                    Double.valueOf(objBoxC1.getText()) + 
                    Double.valueOf(objBoxC2.getText()) + 
                    Double.valueOf(objBoxC3.getText()) + 
                    Double.valueOf(objBoxC4.getText())) / 4;

                objTagResult.setText(String.valueOf(x));
                objTagZ.setForeground(Color.BLACK);
            }

            //? Eventos de los botones cambio de color
            @Override
            public void mousePressed(MouseEvent me) {
                objTagZ.setForeground(Color.red);
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                objTagZ.setForeground(Color.YELLOW);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                objTagZ.setForeground(Color.BLUE);
            }

            @Override
            public void mouseExited(MouseEvent me) {
                objTagZ.setForeground(Color.GREEN);
            }
        });
    }
}