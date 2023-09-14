package app.components;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author ONII404
 */

public class gui extends JFrame {

    private JRadioButton r1;
    private JRadioButton r2;

    private JLabel resLabel;

    private String[] labelsText = { "Peso", "Altura", "Dia de nacimiento", "Mes de nacimiento" };
    private JLabel[] labels = new JLabel[labelsText.length];

    private JTextField[] textFields = new JTextField[labelsText.length];

    private String[] buttonsText = { "Calcular", "Limpiar", "Salir" };
    private JButton[] buttons = new JButton[buttonsText.length];
    ButtonGroup group = new ButtonGroup();

    public gui() {
        super("Sistema");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 380);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setResizable(false);

        r1 = new JRadioButton("Calcular indice de masa muscular");
        r1.setBounds(10, 50, 300, 20);
        add(r1);

        r2 = new JRadioButton("Calcular Signo sodiacal");
        r2.setBounds(10, 150, 300, 20);
        add(r2);

        group.add(r1);
        group.add(r2);

        resLabel = new JLabel("Resultado");
        resLabel.setBounds(350, 100, 100, 30);
        add(resLabel);

        // Impreción de los Labels y TextFields
        for (int i = 0; i < labelsText.length; i++) {

            // Labels
            labels[i] = new JLabel(labelsText[i]);
            if (i < 2) {
                labels[i].setBounds(20, 80 + (i * 30), 100, 30);
            } else {
                labels[i].setBounds(20, 180 + ((i - 2) * 30), 140, 30);
            }
            add(labels[i]);

            // TextFields
            textFields[i] = new JTextField();
            if (i < 2) {
                textFields[i].setBounds(150, 80 + (i * 30), 100, 30);
            } else {
                textFields[i].setBounds(150, 180 + ((i - 2) * 30), 100, 30);
            }
            add(textFields[i]);
        }

        // Impreción de los botones
        for (int i = 0; i < buttonsText.length; i++) {
            buttons[i] = new JButton(buttonsText[i]);
            buttons[i].setBounds(50 + (i * 110), 280, 100, 30);
            buttons[i].addActionListener(btnListener(i));
            add(buttons[i]);
        }
    }

    private ActionListener btnListener(int btnID) {

        ActionListener action = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (btnID == 0) {
                    // Boton Calcular
                    funCalcular();

                } else if (btnID == 1) {
                    // Boton Limpiar
                    group.clearSelection();
                    resLabel.setText("Resultado");
                    for (int i = 0; i < textFields.length; i++) {
                        textFields[i].setText("");
                    }

                } else if (btnID == 2) {
                    // Boton Salir
                    System.exit(0);
                }

            }
        };
        return action;
    }

    private void funCalcular() {

        if (r1.isSelected()) {
            double IMM = 0;
            double peso = Double.parseDouble(textFields[0].getText());
            double altura = Double.parseDouble(textFields[1].getText());
            IMM = peso / (altura * altura);
            resLabel.setText("IMM: " + IMM);
            System.out.println("IMM " + IMM);

        } else if (r2.isSelected()) {
            int dia = Integer.parseInt(textFields[2].getText());
            int mes = Integer.parseInt(textFields[3].getText());
            resLabel.setText("Signo: " + signosSodiacales(dia, mes));
        }

    }

    private String signosSodiacales(int dia, int mes) {

        // Aries
        if (mes == 3 && dia >= 21 || mes == 4 && dia <= 19) {
            resLabel.setText("Aries");
            return "Aries";
        }

        // Tauro
        else if (mes == 4 && dia >= 20 || mes == 5 && dia <= 20) {
            resLabel.setText("Tauro");
            return "Tauro";
        }

        // Geminis
        else if (mes == 5 && dia >= 21 || mes == 6 && dia <= 20) {
            resLabel.setText("Geminis");
            return "Geminis";
        }

        // Cancer
        else if (mes == 6 && dia >= 21 || mes == 7 && dia <= 20) {
            resLabel.setText("Cancer");
            return "Cancer";
        }

        // Leo
        else if (mes == 7 && dia >= 21 || mes == 8 && dia <= 20) {
            resLabel.setText("Leo");
            return "Leo";
        }

        // Virgo
        else if (mes == 8 && dia >= 21 || mes == 9 && dia <= 20) {
            resLabel.setText("Virgo");
            return "Virgo";
        }

        // Libra
        else if (mes == 9 && dia >= 23 || mes == 10 && dia <= 22) {
            resLabel.setText("Libra");
            return "Libra";
        }

        // Escorpio
        else if (mes == 10 && dia >= 21 || mes == 11 && dia <= 20) {
            resLabel.setText("Escorpio");
            return "Escorpio";
        }

        // Sagitario
        else if (mes == 11 && dia >= 21 || mes == 12 && dia <= 20) {
            resLabel.setText("Sagitario");
            return "Sagitario";
        }

        // Capricornio
        else if (mes == 12 && dia >= 21 || mes == 1 && dia <= 20) {
            resLabel.setText("Capricornio");
            return "Capricornio";
        }

        // Acuario
        else if (mes == 1 && dia >= 21 || mes == 2 && dia <= 20) {
            resLabel.setText("Acuario");
            return "Acuario";
        }

        // Piscis
        else if (mes == 2 && dia >= 21 || mes == 3 && dia <= 20) {
            resLabel.setText("Piscis");
            return "Piscis";
        }

        return "";
    }
}
