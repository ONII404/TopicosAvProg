package app.recursos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FrameClassC4 extends JFrame{
    public FrameClassC4(){
        super("Sistema promedio sobre 6 calificaciones (FrameClassC4)");

    // Crear objetos de JLabel
    JLabel objTagC1 = new JLabel("Capturar calificacion  1...");
    JLabel objTagC2 = new JLabel("Capturar calificacion  2...");
    JLabel objTagC3 = new JLabel("Capturar calificacion  3...");
    JLabel objTagC4 = new JLabel("Capturar calificacion  4...");
    JLabel objTagC5 = new JLabel("Capturar calificacion  5...");
    JLabel objTagC6 = new JLabel("Capturar calificacion  6...");
    JLabel objTagZ = new JLabel("El resultado  es...");
    JLabel objTagResult = new JLabel("...");

    // Crear objetos de JTextField
    JTextField objBoxC1 = new JTextField("");
    JTextField objBoxC2 = new JTextField("");
    JTextField objBoxC3 = new JTextField("");
    JTextField objBoxC4 = new JTextField("");
    JTextField objBoxC5 = new JTextField("");
    JTextField objBoxC6 = new JTextField("");
    
    // Crear objetos de JButton
    JButton objBottonProm4 = new JButton("Promedio de 4 calificaciones ");
    JButton objBottonEnd = new JButton("Terminar");
    JButton objBottonClean = new JButton("Limpiar");

    // Agregar objetos a la ventana
    this.add(objTagC1);
    this.add(objTagC2);
    this.add(objTagC3);
    this.add(objTagC4);
    this.add(objTagC5);
    this.add(objTagC6);
    this.add(objTagZ);
    this.add(objTagResult);
    this.add(objBoxC1);
    this.add(objBoxC2);
    this.add(objBoxC3);
    this.add(objBoxC4);
    this.add(objBoxC5);
    this.add(objBoxC6);
    this.add(objBottonProm4);
    this.add(objBottonEnd);
    this.add(objBottonClean);

    // Posicion y tamaño de los objetos en la ventana
    objTagC1.setBounds(10, 30, 200, 30);
    objTagC2.setBounds(10, 60, 200, 30);
    objTagC3.setBounds(10, 90, 200, 30);
    objTagC4.setBounds(10, 120, 200, 30);
    objTagC5.setBounds(10, 150, 200, 30);
    objTagC6.setBounds(10, 180, 200, 30);
    objTagZ.setBounds(10, 210, 200, 30);
    objTagResult.setBounds(200, 210, 200, 30);
    objBoxC1.setBounds(200, 30, 200, 30);
    objBoxC2.setBounds(200, 60, 200, 30);
    objBoxC3.setBounds(200, 90, 200, 30);
    objBoxC4.setBounds(200, 120, 200, 30);
    objBoxC5.setBounds(200, 150, 200, 30);
    objBoxC6.setBounds(200, 180, 200, 30);
    objBottonProm4.setBounds(10, 250, 100, 30);
    objBottonEnd.setBounds(150, 250, 100, 30);
    objBottonClean.setBounds(280, 250, 100, 30);

    // Propiedades de la ventana
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.setLayout(null);
    this.setSize(600, 400);
    this.setLocationRelativeTo(null);

    // Eventos de los botones
    objBottonProm4.addActionListener(new ActionListener() {

      public void actionPerformed(ActionEvent ae) {

        Double x = (
          Double.valueOf(objBoxC1.getText()) + 
          Double.valueOf(objBoxC2.getText()) + 
          Double.valueOf(objBoxC3.getText()) + 
          Double.valueOf(objBoxC4.getText()) +
          Double.valueOf(objBoxC5.getText()) +
          Double.valueOf(objBoxC6.getText())) / 6;

        objTagResult.setText(String.valueOf(x));

      }
    });
    }
}
