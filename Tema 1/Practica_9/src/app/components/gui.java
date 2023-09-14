package app.components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {

    int total;

    String[] labelText = {"Dias", "Hotel", "Comida", "Taxi"};
    JLabel[] text = new JLabel[labelText.length];
    JTextField[] input = new JTextField[labelText.length];

    String[] listText = {"Total: ", "Hotel: ", "Comida: ", "Taxi: "};
    JLabel[] listLabel = new JLabel[listText.length];

    String[] btnText = {"Calcular", "Limpiar", "Salir"};
    JButton[] btn = new JButton[btnText.length];

    public gui() {
        this.setTitle("Monto del Cheque");
        this.setSize(400, 300);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < labelText.length; i++) {
            text[i] = new JLabel(labelText[i]);
            text[i].setBounds(10, 10 + (i * 30), 100, 30);
            this.add(text[i]);

            input[i] = new JTextField();
            input[i].setBounds(120, 10 + (i * 30), 100, 30);
            this.add(input[i]);

            if (i < 3) {
                btn[i] = new JButton(btnText[i]);
                btn[i].addActionListener(btnFuntion(i));
                btn[i].setBounds(50 + (i * 100), 200, 100, 30);
                this.add(btn[i]);
            }

            listLabel[i] = new JLabel(listText[i]);
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

                    listLabel[0].setText(listText[0] + total);
                    listLabel[1].setText(listText[1] + hotelTotal);
                    listLabel[2].setText(listText[2] + comidaTotal);
                    listLabel[3].setText(listText[3] + taxiTotal);

                } else if (btnID == 1) {
                    for (int i = 0; i < input.length; i++) {
                        input[i].setText("");
                        listLabel[i].setText(listText[i]);
                    }
                } else if (btnID == 2) {
                    System.exit(0);
                }
            }
        };

        return action;
    }

}
