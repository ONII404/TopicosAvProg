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

    private String[] labelsText = { "Peso", "Altura", "Dia de nacimiento", "Mes de nacimiento" };
    private String[] buttonsText = { "Calcular", "Limpiar", "Salir" };

    private JLabel[] labels = new JLabel[labelsText.length];
    private JTextField[] textFields = new JTextField[labelsText.length];
    private JButton[] buttons = new JButton[buttonsText.length];

    private JRadioButton r1, r2;
    private JLabel resLabel;
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
            resLabel.setText("Signo: " + signosZodiacales(dia, mes));
        }

    }

    private String signosZodiacales(int dia, int mes) {
        String signo = "";
        switch (mes) {
            case 1:
                if (dia <= 20) {
                    signo = "Capricornio";
                } else if (dia >= 21) {
                    signo = "Acuario";
                }
                break;
            case 2:
                if (dia <= 20) {
                    signo = "Acuario";
                } else if (dia >= 21) {
                    signo = "Piscis";
                }
                break;
            case 3:
                if (dia >= 21) {
                    signo = "Aries";
                } else {
                    signo = "Piscis";
                }
                break;
            case 4:
                if (dia <= 19) {
                    signo = "Aries";
                } else if (dia >= 20) {
                    signo = "Tauro";
                }
                break;
            case 5:
                if (dia <= 20) {
                    signo = "Tauro";
                } else if (dia >= 21) {
                    signo = "Géminis";
                }
                break;
            case 6:
                if (dia <= 20) {
                    signo = "Géminis";
                } else if (dia >= 21) {
                    signo = "Cáncer";
                }
                break;
            case 7:
                if (dia <= 20) {
                    signo = "Cáncer";
                } else if (dia >= 21) {
                    signo = "Leo";
                }
                break;
            case 8:
                if (dia <= 20) {
                    signo = "Leo";
                } else if (dia >= 21) {
                    signo = "Virgo";
                }
                break;
            case 9:
                if (dia >= 23) {
                    signo = "Libra";
                } else {
                    signo = "Virgo";
                }
                break;
            case 10:
                if (dia <= 22) {
                    signo = "Libra";
                } else if (dia >= 21) {
                    signo = "Escorpio";
                }
                break;
            case 11:
                if (dia <= 20) {
                    signo = "Escorpio";
                } else if (dia >= 21) {
                    signo = "Sagitario";
                }
                break;
            case 12:
                if (dia <= 20) {
                    signo = "Sagitario";
                } else if (dia >= 21) {
                    signo = "Capricornio";
                }
                break;
        }
        return signo;
    }
}
