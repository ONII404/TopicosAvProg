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

public class gui extends JFrame {

    /*
     * checkbox: Arreglo de componentes de tipo checkbox
     * textFields: Arreglo de componentes de tipo textfield
     * prices: Arreglo valores int para almacenar los precios
     * Title: Etiqueta para mostrar el titulo
     * resultado: Etiqueta para mostrar el resultado total
     * total: Variable para almacenar el total de precios seleccionados
     * 
     */

    private JCheckBox[] checkBoxes;
    private JTextField[] textFields;
    private int[] prices = { 70, 45, 35, 50, /* 25 */ };
    private JLabel title;
    private JLabel resultado;
    private int total;

    // Constructor de la clase
    public gui() {

        // Configuración de la ventana
        super("Cine");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(360, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        // Arreglo de items
        String[] items = { "Palomitas", "Refresco", "Nachos", "Nieve", /* "Chocolates" */ };

        // Inicialización de los componentes en base al arreglo items
        checkBoxes = new JCheckBox[items.length];
        textFields = new JTextField[items.length];

        // Configuración del titulo
        title = new JLabel("Caja de venta de Snacks");
        title.setBounds(100, 5, 200, 30);
        title.setFont(new Font("Arial", Font.BOLD, 14));
        add(title);

        /*
         * Bucle for para la impresión de los componentes en base a
         * la longitud de "items"
         * Donde 'i' arranca en '0' e incrementa en '1' mientras que 'i'
         * sea menor a la longitud "items"
         */

        for (int i = 0; i < items.length; i++) {

            // creacion de los checkbox
            checkBoxes[i] = new JCheckBox(items[i] + " $" + prices[i]);
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
        calTotalBtn.addActionListener(sumaEvent());
        calTotalBtn.setBounds(10, 300, 100, 30);
        add(calTotalBtn); // Agregamo el boton al frame

        JButton cleanBtn = new JButton("Limpiar");
        cleanBtn.addActionListener(cleanData());
        cleanBtn.setBounds(130, 300, 100, 30);
        add(cleanBtn); // Agregamo el boton al frame

        JButton out = new JButton("Salir");
        out.setBounds(250, 300, 100, 30);
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
                        total += cantidad * prices[i];
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