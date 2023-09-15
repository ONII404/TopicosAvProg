package app.components;

// Librearias importadas
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author ONII404
 */

public class gui extends JFrame {

    /**
     * ITEM_NAMES: Arreglo de tipo String para almacenar los nombres de los
     * productos
     * ITEM_PRICES: Arreglo de tipo int para almacenar los precios de los
     * productos
     * checkBoxes: Arreglo de componentes de tipo checkbox
     * textFields: Arreglo de componentes de tipo textfield
     * title: Etiqueta para mostrar el titulo
     * resultado: Etiqueta para mostrar el resultado total
     * total: Variable para almacenar el total de precios seleccionados
     * 
     */

    String[] ITEM_NAMES = { "Palomitas", "Refresco", "Nachos", "Nieve" };
    int[] ITEM_PRICES = { 70, 45, 35, 50 };

    private JCheckBox[] checkBoxes = new JCheckBox[ITEM_NAMES.length];
    private JTextField[] textFields = new JTextField[ITEM_NAMES.length];
    private JLabel title, resultado;
    private int total;

    // Constructor de la clase
    public gui() {
        super("Cine");
        setSize(360, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        // Configuración del label titulo
        title = new JLabel("Caja de venta de Snacks");
        title.setBounds(100, 5, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 14));
        add(title);

        /**
         * Bucle for para la impresión de los componentes en base a
         * la longitud de "ITEM_NAMES"
         * Donde 'i' arranca en '0' e incrementa en '1' mientras que 'i'
         * sea menor a la longitud "ITEM_NAMES"
         */

        for (int i = 0; i < ITEM_NAMES.length; i++) {

            // creacion de los checkbox
            checkBoxes[i] = new JCheckBox(ITEM_NAMES[i] + " $" + ITEM_PRICES[i]);
            checkBoxes[i].setBounds(10, 40 + (i * 40), 150, 30);
            add(checkBoxes[i]); // Agregamos los checkbox al frame

            // creacion de los label
            JLabel label = new JLabel("Cantidad:");
            label.setBounds(180, 40 + (i * 40), 150, 30);
            add(label); // Agregamos los label al frame

            textFields[i] = new JTextField();
            textFields[i].setBounds(280, 40 + (i * 40), 70, 30);
            add(textFields[i]); // Agregamos los textfield al frame
        }

        // Configuración del label resultado
        resultado = new JLabel("Total:  $" + total);
        resultado.setBounds(30, 250, 150, 30);
        resultado.setFont(new Font("Arial", Font.BOLD, 16));
        add(resultado); // Agregamos el label al frame

        /*
         * Configuración de los JButton
         * 
         * 
         */

        JButton calTotalBtn = new JButton("Calcular");
        calTotalBtn.addActionListener(sumaEvent()); // Agregamos el actionListener
        calTotalBtn.setBounds(10, 300, 100, 30);
        add(calTotalBtn); // Agregamo el boton al frame

        JButton cleanBtn = new JButton("Limpiar");
        cleanBtn.addActionListener(cleanData()); // Agregamos el actionListener
        cleanBtn.setBounds(130, 300, 100, 30);
        add(cleanBtn); // Agregamo el boton al frame

        JButton out = new JButton("Salir");
        out.setBounds(250, 300, 100, 30);
        // Definimos el actionListener para el boton "Salir"
        out.addActionListener(e -> {
            System.exit(0);
        });
        add(out); // Agregamo el boton al frame
    }

    /**
     * Funcion de tipo ActionListener
     * Crea y devuelve un ActionListener para el botón "Calcular".
     * Este ActionListener calcula el total de la compra.
     * 
     */

    public ActionListener sumaEvent() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                total = 0; // Iniciamos el "total" (evita la suma infinita)

                /**
                 * Bucle for donde se verifica si el checkbox[i] está
                 * seleccionado
                 * Obtiene el valor del textfield[i] y lo guarda en
                 * la variable cantidad
                 * Se suma al "total" el resultado de la multiplicación
                 * de "cantidad" por el "precio" del producto.
                 */

                for (int i = 0; i < checkBoxes.length; i++) {
                    if (checkBoxes[i].isSelected()) {
                        int cantidad = Integer.parseInt(textFields[i].getText());
                        total += cantidad * ITEM_PRICES[i];
                    }
                }

                // Imprimimos el resultado en el label resultado
                resultado.setText("Total:  $" + total);
            }
        };

        // Retornamos el actionListener
        return actionListener;
    }

    /**
     * Funcion de tipo ActionListener
     * Crea y devuelve un ActionListener para el botón "Limpiar".
     * Este ActionListener reinicia los campos y el total de la compra.
     */

    public ActionListener cleanData() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                /*
                 * Bucle for donde se deseleccionan los checkbox
                 * y se limpian los textfield
                 * 
                 */
                for (int i = 0; i < checkBoxes.length; i++) {
                    checkBoxes[i].setSelected(false);
                    textFields[i].setText("");
                }

                // Reiniciamos el total
                total = 0;
                resultado.setText("Total:  $" + total);
            }
        };

        // Retornamos el actionListener
        return actionListener;
    }
}