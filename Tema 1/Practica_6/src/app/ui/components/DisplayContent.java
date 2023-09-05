package app.ui.components;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

public class DisplayContent {

    // ? Metodo para crear la fuente Arial
    private Font arial(int size, int type) {
        return new Font("Arial", Font.BOLD, size);
    }

    // ? Metodo para crear la operacion de suma
    public ArrayList<JLabel> createSuma() {
        ArrayList<JLabel> sumaList = new ArrayList<JLabel>();

        JLabel preNums = new JLabel("¿Cuantos numeros desea sumar?");
        preNums.setBounds(3, 5, 250, 15);
        preNums.setForeground(Color.white);
        preNums.setVisible(true);

        int numOp = 3;
        String numsOp = numOp + "";

        JLabel nums = new JLabel(numsOp);
        nums.setBounds(100, 50, 100, 50);
        nums.setFont(arial(50, 0));
        nums.setForeground(Color.white);
        nums.setHorizontalAlignment(JTextField.CENTER);
        nums.setVisible(true);

        sumaList.add(preNums);
        sumaList.add(nums);

        if (numOp > 0) {
            sumaList.remove(preNums);
            sumaList.remove(nums);
            ArrayList<JLabel> numsList = new ArrayList<JLabel>();

            for (int i = 0; i < numOp; i++) {
                JLabel num = new JLabel("valor " + i);
                num.setBounds(3, 0 + (i * 50), 100, 50);
                num.setFont(arial(15, 0));
                num.setForeground(Color.white);
                num.setVisible(true);
                numsList.add(num);
            }
            sumaList.addAll(numsList);
        }

        return sumaList;
    }
}
