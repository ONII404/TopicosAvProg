package app.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author ONII404
 */
public class ClassCalif extends JFrame {

   public ClassCalif() {
      // Titulo de la Ventana
      super("Sistema promedio sobre 4 calificaciones");
      // Definimos el tamaño de la Ventana
      this.setSize(600, 400);
      // Definimos el diseño(Layout) de la Ventana
      this.setLayout(null);
      // Definimos la posicion de la Ventana
      this.setLocationRelativeTo(null);
      // Al cerra la Ventana se termina la ejecucion del programa
      this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

      /*
       * Creacion de los Objetos de la Clase JLabel
       * 
       */

      JLabel objTagCalif1 = new JLabel("Capturar calificacion 1...");
      objTagCalif1.setBounds(10, 30, 200, 30);
      add(objTagCalif1);

      JLabel objTagCalif2 = new JLabel("Capturar calificacion 2...");
      objTagCalif2.setBounds(10, 60, 200, 30);
      add(objTagCalif2);

      JLabel objTagCalif3 = new JLabel("Capturar calificacion 3...");
      objTagCalif3.setBounds(10, 90, 200, 30);
      add(objTagCalif3);

      JLabel objTagCalif4 = new JLabel("Capturar calificacion 4...");
      objTagCalif4.setBounds(10, 120, 200, 30);
      add(objTagCalif4);

      JLabel objTagZ = new JLabel("El resultado es...");
      objTagZ.setBounds(10, 150, 200, 30);
      add(objTagZ);

      JLabel objTagResult = new JLabel("...");
      objTagResult.setBounds(200, 150, 200, 30);
      add(objTagResult);

      /*
       * Creacion de los Objetos de la Clase JTextField
       * 
       */

      JTextField objTagBox1 = new JTextField("");
      objTagBox1.setBounds(200, 30, 200, 30);
      add(objTagBox1);

      JTextField objTagBox2 = new JTextField("");
      objTagBox2.setBounds(200, 60, 200, 30);
      add(objTagBox2);

      JTextField objTagBox3 = new JTextField("");
      objTagBox3.setBounds(200, 90, 200, 30);
      add(objTagBox3);

      JTextField objTagBox4 = new JTextField("");
      objTagBox4.setBounds(200, 120, 200, 30);
      add(objTagBox4);

      /*
       * Creacion de los Objetos de la Clase JButton
       * 
       */

      JButton objBottomExec = new JButton("Promedio sobre 4 calificaciones ");
      objBottomExec.setBounds(10, 200, 100, 30);
      add(objBottomExec);

      JButton objBottomEnd = new JButton("Terminar");
      objBottomEnd.setBounds(150, 200, 100, 30);
      add(objBottomEnd);

      JButton objBottomClean = new JButton("Limpiar");
      objBottomClean.setBounds(280, 200, 100, 30);
      add(objBottomClean);
   }
}