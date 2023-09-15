package app.components;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @autor: ONII404
 */

public class FrameClassC3 extends JFrame {

    // Array de nombres de etiquetas
    private String[] LABEL_NAMES = {
            "Capturar calificacion 1...", "Capturar calificacion 2...",
            "Capturar calificacion 3...", "Capturar calificacion 4...", "Capturar calificacion 5..."
    };

    // Array de nombres de botones
    private String[] BUTTON_NAMES = { "Promediar", "Terminar", "Limpiar" };

    // Array de objetos de etiquetas
    private JLabel[] labels = new JLabel[LABEL_NAMES.length];

    // Array de objetos de cajas de texto
    private JTextField[] boxes = new JTextField[LABEL_NAMES.length];

    // Array de objetos de botones
    private JButton[] buttons = new JButton[BUTTON_NAMES.length];

    // Objetos de etiquetas
    private JLabel resultTag, result;

    // Constructor
    public FrameClassC3() {
        super("Sistema promedio sobre 5 calificaciones (FrameClassC3)");
        this.setSize(600, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*
         * Bucle para imprimir las etiquetas, cajas de texto y botones
         * Empieza en 0 y termina con longitud del array "nombres de etiquetas"
         * i++ es lo mismo que i = i + 1
         */

        for (int i = 0; i < LABEL_NAMES.length; i++) {

            // Crear objetos de etiquetas
            labels[i] = new JLabel(LABEL_NAMES[i]);
            labels[i].setBounds(25, 30 + (i * 30), 200, 30);
            add(labels[i]);

            // Crear objetos de cajas de texto
            boxes[i] = new JTextField("");
            boxes[i].setBounds(225, 30 + (i * 30), 200, 30);
            add(boxes[i]);

            // Crear objetos de botones
            // De esta manera solo se crean 3 botones
            if (i < buttons.length) {
                buttons[i] = new JButton(BUTTON_NAMES[i]);
                buttons[i].setBounds(30 + (i * 130), 300, 120, 30);
                buttons[i].addActionListener(calculate(i));
                add(buttons[i]);
            }
        }

        // Crear objeto de etiqueta para el resultado
        resultTag = new JLabel("El resultado es...");
        resultTag.setBounds(30, 180, 200, 30);
        add(resultTag);

        // Crear objeto de etiqueta para el resultado
        result = new JLabel("...");
        result.setBounds(230, 180, 200, 30);
        add(result);
    }

    /**
     * 
     * @param btnID = ID del boton
     * @return = evento del boton
     */

    private ActionListener calculate(int btnID) {
        ActionListener event = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // Si el ID del boton es 0, entonces promediar
                if (btnID == 0) {

                    // Variable para guardar la suma de los valores de las cajas de texto
                    double sum = 0;

                    // Bucle para sumar los valores de las cajas de texto
                    for (int i = 0; i < boxes.length; i++) {
                        sum += Double.parseDouble(boxes[i].getText());
                    }

                    // Mostrar el resultado en la etiqueta de resultado
                    result.setText(String.valueOf(sum / boxes.length));
                }
            }
        };
        return event; // Retornar el evento
    }
}