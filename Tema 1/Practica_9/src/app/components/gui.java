package app.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {

    int total;

    String[] LABEL_NAMES = {"Dias", "Hotel", "Comida", "Taxi"};
    String[] LABEL2_NAMES = {"Total: ", "Hotel: ", "Comida: ", "Taxi: "};
    String[] BUTTON_NAMES = {"Calcular", "Limpiar", "Salir"};
    
    JLabel[] text = new JLabel[LABEL_NAMES.length];
    JTextField[] input = new JTextField[LABEL_NAMES.length];
    JLabel[] listLabel = new JLabel[LABEL2_NAMES.length];
    JButton[] btn = new JButton[BUTTON_NAMES.length];


    public gui() {
        this.setTitle("Monto del Cheque");
        this.setSize(400, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < LABEL_NAMES.length; i++) {
            text[i] = new JLabel(LABEL_NAMES[i]);
            text[i].setBounds(10, 10 + (i * 30), 100, 30);
            this.add(text[i]);

            input[i] = new JTextField();
            input[i].setBounds(120, 10 + (i * 30), 100, 30);
            this.add(input[i]);

            if (i < 3) {
                btn[i] = new JButton(BUTTON_NAMES[i]);
                btn[i].addActionListener(btnFuntion(i));
                btn[i].setBounds(50 + (i * 100), 200, 100, 30);
                this.add(btn[i]);
            }

            listLabel[i] = new JLabel(LABEL2_NAMES[i]);
            listLabel[i].setBounds(250, 10 + (i * 30), 100, 30);
            this.add(listLabel[i]);
        }
    }

    private ActionListener btnFuntion(int btnID) {
        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (btnID == 0) {
                    total = 0;
                    for (int i = 0; i < input.length; i++) {
                        if (i != 0) {
                            total += Integer.parseInt(input[i].getText());
                        }
                    }
                    int hotelTotal = Integer.parseInt(input[1].getText()) * Integer.parseInt(input[0].getText());

                    int comidaTotal = Integer.parseInt(input[2].getText()) * Integer.parseInt(input[0].getText());

                    int taxiTotal = Integer.parseInt(input[3].getText()) * Integer.parseInt(input[0].getText());

                    listLabel[0].setText(LABEL2_NAMES[0] + total);
                    listLabel[1].setText(LABEL2_NAMES[1] + hotelTotal);
                    listLabel[2].setText(LABEL2_NAMES[2] + comidaTotal);
                    listLabel[3].setText(LABEL2_NAMES[3] + taxiTotal);

                } else if (btnID == 1) {
                    for (int i = 0; i < input.length; i++) {
                        input[i].setText("");
                        listLabel[i].setText(LABEL2_NAMES[i]);
                    }
                } else if (btnID == 2) {
                    System.exit(0);
                }
            }
        };

        return action;
    }

}
