package app.ui.components.displays;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PotenciaDisplay extends JPanel {
    JTextField valor1;
    JTextField valor2;
    JLabel simbolo;

    public PotenciaDisplay() {
        this.setBounds(0, 0, 300, 130);
        this.setLayout(null);
        this.setBackground(Color.darkGray);

        // Box1
        valor1 = new JTextField();
        valor1.setBounds(150, 10, 140, 50);
        valor1.setBackground(Color.darkGray);
        valor1.setForeground(Color.white);
        this.add(valor1);

        // Box2
        valor2 = new JTextField();
        valor2.setBounds(150, 70, 140, 50);
        valor2.setBackground(Color.darkGray);
        valor2.setForeground(Color.white);
        this.add(valor2);

        // Simbolo

        simbolo = new JLabel("xˇ2");
        simbolo.setBounds(90, 75, 40, 40);
        simbolo.setForeground(Color.white);
        simbolo.setFont(new Font("Arial", Font.PLAIN, 30));
        this.add(simbolo);
        this.setVisible(true);
    }
}
