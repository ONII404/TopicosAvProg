package app.logic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author ONII404
 */
public class KeysEvents {

    public static String newValue = null;

    public static ActionListener getKeysListener(int buttonID) {
        ActionListener actionListener = null;

        switch (buttonID) {
            case 0:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("7");

                        newValue = "7";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 1:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("8");

                        newValue = "8";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 2:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("9");

                        newValue = "9";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 3:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("4");

                        newValue = "4";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 4:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("5");

                        newValue = "5";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 5:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("6");

                        newValue = "6";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 6:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("1");

                        newValue = "1";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 7:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("2");

                        newValue = "2";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 8:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("3");

                        newValue = "3";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 9:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("+/-");

                    }
                };
                break;
            case 10:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("0");

                        newValue = "0";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 11:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(".");

                        newValue = ".";
                        System.out.println(newValue + " Nuevo");
                    }
                };
                break;
            case 12:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("<-");
                    }
                };
                break;
            case 13:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("CE");
                    }
                };
                break;
            case 14:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("=");
                    }
                };
                break;
        }

        return actionListener;
    }

}
