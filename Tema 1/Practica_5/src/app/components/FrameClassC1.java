package app.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @autor: ONII404
 */

public class FrameClassC1 extends JFrame {

    public FrameClassC1() {
        super("Sistema promedio sobre 4 calificaciones (FrameClassC1)");
        this.setSize(600, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Crear objetos de JLabel
        JLabel objTagC1 = new JLabel("Capturar calificacion 1...");
        objTagC1.setBounds(10, 30, 200, 30);
        add(objTagC1);

        JLabel objTagC2 = new JLabel("Capturar calificacion 2...");
        objTagC2.setBounds(10, 60, 200, 30);
        add(objTagC2);

        JLabel objTagC3 = new JLabel("Capturar calificacion 3...");
        objTagC3.setBounds(10, 90, 200, 30);
        add(objTagC3);

        JLabel objTagC4 = new JLabel("Capturar calificacion 4...");

        objTagC4.setBounds(10, 120, 200, 30);
        add(objTagC4);

        JLabel objTagZ = new JLabel("El resultado es...");
        objTagZ.setBounds(10, 150, 200, 30);
        add(objTagZ);

        JLabel objTagResult = new JLabel("...");
        objTagResult.setBounds(200, 150, 200, 30);
        add(objTagResult);

        /*
         * Crear objetos JTextField
         * 
         */

        JTextField objBoxC1 = new JTextField("");
        objBoxC1.setBounds(200, 30, 200, 30);
        add(objBoxC1);

        JTextField objBoxC2 = new JTextField("");
        objBoxC2.setBounds(200, 60, 200, 30);
        add(objBoxC2);

        JTextField objBoxC3 = new JTextField("");
        objBoxC3.setBounds(200, 90, 200, 30);

        add(objBoxC3);

        JTextField objBoxC4 = new JTextField("");
        objBoxC4.setBounds(200, 120, 200, 30);
        add(objBoxC4);

        /*
         * Crear objetos JButton
         * 
         */

        JButton objBottonProm4 = new JButton("Promedio de 4 calificaciones ");
        objBottonProm4.setBounds(10, 200, 100, 30);
        add(objBottonProm4);

        JButton objBottonEnd = new JButton("Terminar");
        objBottonEnd.setBounds(150, 200, 100, 30);
        add(objBottonEnd);

        JButton objBottonClean = new JButton("Limpiar");
        objBottonClean.setBounds(280, 200, 100, 30);
        add(objBottonClean);

        /*
         * Eventos de los botones
         * 
         */

        objBottonProm4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {

                Double x = (Double.valueOf(objBoxC1.getText()) + Double.valueOf(objBoxC2.getText())
                        + Double.valueOf(objBoxC3.getText()) + Double.valueOf(objBoxC4.getText())) / 4;

                objTagResult.setText(String.valueOf(x));
            }
        });
    }
}