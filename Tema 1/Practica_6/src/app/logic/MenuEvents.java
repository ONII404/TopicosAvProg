package app.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @ONII404
 */

public class MenuEvents {

    public static ActionListener getActionListener(int buttonID) {
        ActionListener actionListener = null;

        switch (buttonID) {
            case 0:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Suma");
                    }
                };
                break;
            case 1:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Resta");
                    }
                };
                break;
            case 2:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Multiplicacion");
                    }
                };
                break;
            case 3:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Division");
                    }
                };
                break;
            case 4:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Potencia");
                    }
                };
                break;
            case 5:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Raiz");
                    }
                };
                break;
            default:
                break;
        }
        return actionListener;
    }
}
