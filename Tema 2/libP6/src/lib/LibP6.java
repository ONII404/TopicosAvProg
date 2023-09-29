package lib;

import java.util.Stack;

/**
 *
 * @author ONII404
 */
public class LibP6 {

    private Stack<String> listNames = new Stack<>();
    private Stack<String> listEdades = new Stack<>();

    public void capturarDatos(String nombre, String edad) {

        if (nombre.isEmpty() || edad.isEmpty()) {
            System.out.println("No se puede dejar campos vacios");
        } else {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);

            listNames.push(nombre);
            listEdades.push(edad);
        }

    }

    public String mayorEdad() {

        int a = Integer.parseInt( listEdades.get(0));
        int b = Integer.parseInt( listEdades.get(1));
        int c = Integer.parseInt( listEdades.get(2));

        if (a > b && a > c) {
            return "El mayor es: " + a;
        } else if (b > a && b > c) {
            return "El mayor es: " + b;
        } else {
            return "El mayor es: " + c;
        }
    }

    public void clearStack() {
        listNames.clear();
        listEdades.clear();
    }

}
