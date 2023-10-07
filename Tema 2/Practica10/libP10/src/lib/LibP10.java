package lib;

import java.util.ArrayList;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class LibP10 {

    /*
     * 
     * Producto
     * 
     */
    Producto productoIn;

    public Producto getProductoIn(String cMerch, String depMerch, int quantity, double total) {
        productoIn = new Producto(cMerch, depMerch, quantity, total);
        return productoIn;
    }

    /*
     * 
     * 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
     */

    /*
     * 
     * Cart
     * 
     */

    private ArrayList<Producto> cart = new ArrayList<Producto>();
    int size = cart.size();

    public String getCartTotal() {
        String totalCart = "";

        for (Producto producto : cart) {
            totalCart += producto.getTotalPrice();
        }
        return totalCart;
    }

    public String getCartItemAdded() {
        String itemAdded = "";

        return itemAdded;
    }

    // public String getCart() {
    // double costoTotal = 0;
    // for (int i = 0; i < cart.size(); i++) {
    // costoTotal += cart.get(i).getTotalPrice();
    // }
    // ;

    // return "" + costoTotal;
    // }

    public String getItems(String cMerch, String depMerch, Double total, String quantity) {

        String item = cMerch + " - " + depMerch + " - " + total + " - " + quantity;

        return item;
    }

    /**
     *
     * @param cMerch   codigo del producto
     * @param depMerch departamento del producto
     * @param quantity cantidad de productos
     * @param total    total de la compra
     */
    public void addtoCart(String cMerch, String depMerch, int quantity, double total) {
        cart.add(new Producto(cMerch, depMerch, quantity, total));
    }

    /**
     * 
     * @implNote Funcion para vaciar el carrito
     */
    public void clsCart() {
        cart.clear();
    }

    /*
     * 
     * 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     */
    /**
     *
     * @param price    Precio del producto
     * @param quantity Cantidad de productos
     * @return Subtotal de la compra
     */
    public String getSubTotal(String price, String quantity) {
        int priceInt = Integer.parseInt(price);
        int quantityInt = Integer.parseInt(quantity);
        String subTotal = String.valueOf(priceInt * quantityInt);
        return subTotal;
    }

    /**
     * 
     * @param price    Precio del producto
     * @param quantity Cantidad de productos
     * @param discount Descuento
     * @param isr      Impuesto
     * @return Total de la compra
     */
    public String getTotal(String price, String quantity, String discount, ButtonModel isr) {

        String total = "";

        double priceDouble = Double.parseDouble(price);
        int quantityInt = Integer.parseInt(quantity);
        double descuentoDEC = Double.parseDouble(discount) / 100.0;

        String rBtn = isr.getActionCommand();

        double isrRate = 0.0;

        switch (rBtn) {
            case "8ISR":
                isrRate = 0.08; // 8% de ISR
                break;
            case "16ISR":
                isrRate = 0.16; // 16% de ISR
                break;
            case "nullISR":
                isrRate = 0.0; // Sin ISR
                break;
        }

        double subtotal = priceDouble * quantityInt;
        double calcISR = subtotal * isrRate;
        double desc = (subtotal + calcISR) * descuentoDEC;
        double totalAmount = (subtotal + calcISR) - desc;
        total = String.format("%.2f", totalAmount);
        return total;
    }

    /*
     * 
     * 
     * 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
     
     */

    /**
     * Valida los datos ingresados.
     *
     * @param cMerch   código del producto
     * @param price    precio del producto
     * @param quantity cantidad de productos
     * @param discount descuento
     * @param isr      impuesto
     * @return true si los datos son válidos, false en caso contrario
     */
    public boolean validateData(String cMerch, Integer depMerch, String price, String quantity, String discount,
            ButtonModel isr) {
        boolean isValid = true;

        StringBuilder errorMessage = new StringBuilder("Errores:\n");

        if (cMerch.isEmpty()) {
            errorMessage.append("- El código del producto no puede estar vacío.\n");
            isValid = false;
        }

        if (depMerch == -1) {
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
        }
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
