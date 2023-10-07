package lib.components;

import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ONII404
 */
public class Validator {

    public Validator() {
    }

    /**
     * Valida los datos ingresados.
     *
     * @param cMerch código del producto
     * @param depMerch departamento del producto
     * @param price precio del producto
     * @param quantity cantidad de productos
     * @param isr impuesto
     * @param discount descuento
     * @param Subtotal subtotal
     * @param Total total
     * @return true si los datos son válidos, false en caso contrario
     */
    public boolean validateData(String cMerch, String depMerch, String price, String quantity, ButtonModel isr, String discount) {

        boolean isValid = true;
        StringBuilder errorMessage = new StringBuilder("Errores:\n");

        if (cMerch.isEmpty()) {
            errorMessage.append("- El código del producto no puede estar vacío.\n");
            isValid = false;
        }

        if (depMerch == null) {
            errorMessage.append("- Debe seleccionar un departamento.\n");
            isValid = false;
        }

        if (!isNumeric(price)) {
            errorMessage.append("- El precio debe ser un valor numérico.\n");
            isValid = false;
        }

        if (!isNumeric(quantity)) {
            errorMessage.append("- La cantidad debe ser un valor numérico.\n");
            isValid = false;
        }

        if (!isNumeric(discount)) {
            errorMessage.append("- El descuento debe ser un valor numérico.\n");
            isValid = false;
        }

        if (isr == null) {
            errorMessage.append("- El impuesto no puede ser nulo.\n");
            isValid = false;
        }

        if (!isValid) {
            JOptionPane.showMessageDialog(
                    null,
                    errorMessage.toString(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        return isValid;
    }

    /**
     * Verifica si una cadena es numérica.
     *
     * @param str cadena a verificar
     * @return true si la cadena es numérica, false en caso contrario
     */
    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        } else{
            try {
                Double.parseDouble(str);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

}
