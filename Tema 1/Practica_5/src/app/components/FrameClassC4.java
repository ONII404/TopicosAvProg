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

public class FrameClassC4 extends JFrame {

    private String[] LABEL_NAMES = {
            "Capturar calificacion 1...", "Capturar calificacion 2...",
            "Capturar calificacion 3...", "Capturar calificacion 4...", "Capturar calificacion 5...", "Capturar calificacion 6..."
    };
    private String[] BUTTON_NAMES = { "Promediar", "Terminar", "Limpiar" };

    private JLabel[] labels = new JLabel[LABEL_NAMES.length];
    private JTextField[] boxes = new JTextField[LABEL_NAMES.length];
    private JButton[] buttons = new JButton[BUTTON_NAMES.length];
    private JLabel resultTag, result;

    public FrameClassC4() {
        super("Sistema promedio sobre 5 calificaciones (FrameClassC3)");
        this.setSize(600, 400);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < LABEL_NAMES.length; i++) {

            labels[i] = new JLabel(LABEL_NAMES[i]);
            labels[i].setBounds(25, 30 + (i * 30), 200, 30);
            add(labels[i]);

            boxes[i] = new JTextField("");
            boxes[i].setBounds(225, 30 + (i * 30), 200, 30);
            add(boxes[i]);

            if (i < buttons.length) {
                buttons[i] = new JButton(BUTTON_NAMES[i]);
                buttons[i].setBounds(30 + (i * 130), 300, 120, 30);
                buttons[i].addActionListener(calculate(i));
                add(buttons[i]);
            }
        }
        resultTag = new JLabel("El resultado es...");
        resultTag.setBounds(30, 240, 200, 30);
        add(resultTag);

        result = new JLabel("...");
        result.setBounds(230, 240, 200, 30);
        add(result);
    }

    private ActionListener calculate(int btnID) {
        ActionListener event = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (btnID == 0) {
                    System.out.println("Promediar");
                    double sum = 0;
                    for (int i = 0; i < boxes.length; i++) {
                        sum += Double.parseDouble(boxes[i].getText());
                    }
                    result.setText(String.valueOf(sum / boxes.length));
                }
            }
        };
        return event;
    }
}