package app.ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import app.ui.components.Key;

/**
 * 
 * @author ONII404
 */

public class MainWIndow extends JFrame {

    // Components
    Key key = new Key();

    // Styles
    Color barMenuDark = new Color(50, 50, 50);
    GridLayout gridLayout = new GridLayout(4, 3, 1, 1);

    // Menu
    JMenuBar barMenu;
    JMenu actionMenu;
    ButtonGroup buttonGroup;
    JRadioButtonMenuItem menuRaBtn;

    // Keys
    JPanel panelKeys;

    JPanel opDisplay;
    // JTextField valor1;
    JTextField valor2;
    JLabel simbolo;
    Stack<String> miStack = new Stack<>();

    public MainWIndow() {
        super("Calculadora By ONII404");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(300, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setBackground(Color.darkGray);

        /**
         *
         * BarMenu
         * 
         **/
        barMenu = new JMenuBar();
        barMenu.setBounds(0, 0, 300, 20);
        barMenu.setBackground(barMenuDark);
        barMenu.setVisible(true);
        actionMenu = new JMenu();
        actionMenu.setText("Actions");
        actionMenu.setForeground(Color.white);
        barMenu.add(actionMenu);
        // Creamos un grupo de botones para que solo se pueda seleccionar uno
        buttonGroup = new ButtonGroup();
        createRdBtn(); // Llamamos al metodo que crea los botones
        // OptionMenu here
        setJMenuBar(barMenu); // Añadimos el menu a la ventana

        /*
         * 
         * Display de Operación
         *
         * 
         */

        opDisplay = new JPanel();
        opDisplay.setBounds(0, 0, 300, 130);
        opDisplay.setLayout(null);
        opDisplay.setBackground(Color.darkGray);
        opDisplay.setVisible(true);
        this.add(opDisplay);

        // Simbolo

        simbolo = new JLabel("");
        simbolo.setBounds(90, 75, 40, 40);
        simbolo.setForeground(Color.white);
        simbolo.setFont(new Font("Arial", Font.PLAIN, 30));
        opDisplay.add(simbolo);

        // Box1
        // valor1 = new JTextField();
        // valor1.setBounds(150, 10, 140, 50);
        // valor1.setBackground(Color.darkGray);
        // valor1.setForeground(Color.white);
        // valor1.setVisible(true);
        // opDisplay.add(valor1);

        // Box2
        valor2 = new JTextField();
        valor2.setBounds(150, 70, 140, 50);
        valor2.setBackground(Color.darkGray);
        valor2.setForeground(Color.white);
        valor2.setVisible(true);
        opDisplay.add(valor2);

        /**
         * 
         * KeysPanel
         * 
         * 
         * 
         **/

        panelKeys = new JPanel();
        panelKeys.setBounds(0, 131, 300, 310);
        panelKeys.setLayout(gridLayout);
        createBtn();
        add(panelKeys);
        panelKeys.setVisible(true);

    }

    /*
     * 
     * BAR MENU
     * 
     * 
     * 
     * 
     */

    private void createRdBtn() {
        for (int i = 0; i < 6; i++) {
            menuRaBtn = new JRadioButtonMenuItem();
            buttonGroup.add(menuRaBtn);
            actionMenu.add(menuRaBtn);

            // Creamos un switch para asignar el texto y el evento a cada boton
            switch (i) {
                case 0:
                    menuRaBtn.setText("Suma");
                    menuRaBtn.addActionListener(getSumaEvent());
                    break;
                case 1:
                    menuRaBtn.setText("Resta");
                    menuRaBtn.addActionListener(getRestaEvent());
                    break;
                case 2:
                    menuRaBtn.setText("Multiplicación");
                    menuRaBtn.addActionListener(getMultiplicacionEvent());
                    break;
                case 3:
                    menuRaBtn.setText("División");
                    menuRaBtn.addActionListener(getDivicionEvent());
                    break;
                case 4:
                    menuRaBtn.setText("Potencia");
                    menuRaBtn.addActionListener(getPotenciaEvent());
                    break;
                case 5:
                    menuRaBtn.setSelected(true);
                    menuRaBtn.setText("Nada");
                    // menuRaBtn.addActionListener();
                    break;
            }
        }
    }

    public ActionListener getSumaEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("setSuma");
                simbolo.setText("+");
            }
        };
        return actionListener;
    }

    public ActionListener getRestaEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                simbolo.setText("-");
                // valor1.setVisible(true);
                // valor2.setVisible(true);
            }
        };
        return actionListener;
    }

    public ActionListener getMultiplicacionEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("setMultiplicacion");
                simbolo.setText("x");
                // valor1.setVisible(true);
                // valor2.setVisible(true);
            }
        };
        return actionListener;
    }

    public ActionListener getDivicionEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("setDivicion");
                simbolo.setText("/");
                // valor1.setVisible(true);
                // valor2.setVisible(true);
            }
        };
        return actionListener;
    }

    public ActionListener getPotenciaEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("setPotencia");
                simbolo.setText("xˇ");
                // valor1.setVisible(false);
                // valor2.setVisible(true);
            }
        };
        return actionListener;
    }

    /*
     * 
     * PANELKEYS
     * 
     * 
     * 
     * 
     */
    private void createBtn() {
        for (int j = 0; j < 16; j++) {
            Key btn = new Key();
            panelKeys.add(btn);

            switch (j) {
                case 0:
                    btn.setText("7");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 1:
                    btn.setText("8");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 2:
                    btn.setText("9");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 3:
                    btn.setText("<-");
                    btn.setBounds(0, 0, 80, 74);
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 4:
                    btn.setText("4");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 5:
                    btn.setText("5");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 6:
                    btn.setText("6");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 7:
                    btn.setText("CE");
                    btn.setBounds(0, 75, 80, 74);
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 8:
                    btn.setText("1");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 9:
                    btn.setText("2");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 10:
                    btn.setText("3");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 11:
                    btn.setText("go");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 12:
                    btn.setText("+/-");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 13:
                    btn.setText("0");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 14:
                    btn.setText(".");
                    btn.addActionListener(getKeysListener(j));
                    break;
                case 15:
                    btn.setText("=");
                    btn.setBounds(0, 150, 80, 149);
                    btn.addActionListener(getKeysListener(j));
                    break;
            }
        }
    }

    public ActionListener getKeysListener(int buttonID) {
        ActionListener actionListener = null;

        switch (buttonID) {
            case 0:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("7");
                        valor2.setText(valor2.getText() + "7");
                    }
                };
                break;
            case 1:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("8");
                        valor2.setText(valor2.getText() + "8");
                    }
                };
                break;
            case 2:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("9");
                        valor2.setText(valor2.getText() + "9");
                    }
                };
                break;
            case 3:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        valor2.setText("");
                    }
                };
                break;
            case 4:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("4");
                        valor2.setText(valor2.getText() + "4");
                    }
                };
                break;
            case 5:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("5");
                        valor2.setText(valor2.getText() + "5");
                    }
                };
                break;
            case 6:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("6");
                        valor2.setText(valor2.getText() + "6");
                    }
                };
                break;
            case 7:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("CE");
                        System.out.println("Cola Vacia: " + miStack.empty());
                        miStack.clear();
                    }
                };
                break;
            case 8:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("1");
                        valor2.setText(valor2.getText() + "1");
                    }
                };
                break;
            case 9:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("2");
                        valor2.setText(valor2.getText() + "2");
                    }
                };
                break;
            case 10:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("3");
                        valor2.setText(valor2.getText() + "3");
                    }
                };
                break;
            case 11:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Agregado: " + valor2.getText());
                        miStack.push(valor2.getText());
                    }
                };
                break;
            case 12:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("+/-");
                    }
                };
                break;
            case 13:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("0");
                        valor2.setText(valor2.getText() + "0");
                    }
                };
                break;
            case 14:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(".");
                        valor2.setText(valor2.getText() + ".");
                    }
                };
                break;
            case 15:
                actionListener = new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("=");
                    }
                };
        }
        return actionListener;
    }




}
