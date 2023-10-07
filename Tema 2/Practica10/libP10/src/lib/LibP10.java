package lib;

import lib.components.Producto;
import lib.components.Validator;
import java.util.ArrayList;
import javax.swing.ButtonModel;

public class LibP10 {

    private Producto productoIn;
    private ArrayList<Producto> cart = new ArrayList<Producto>();

    /**
     * 
     * @param codeM codigo del producto
     * @param depMerch departamento del producto
     * @param priceM precio del producto
     * @param quantity cantidad de productos
     * @param isrM impuesto
     * @param discountM descuento
     * @return true si los datos son válidos, false en caso contrario
     */
    public boolean getProductoIn(String codeM, String depMerch, String priceM, String quantity, ButtonModel isrM, String discountM) {

        Validator validate = new Validator();
        boolean valido = validate.validateData(codeM, depMerch, priceM, quantity, isrM, discountM);

        if (valido == true) {
            productoIn = new Producto(codeM, depMerch, priceM, quantity, isrM, discountM);
        }
        return valido;
    }


    /**
     * 
     * @implNote Funcion para validar si hay un producto en la cola
     */
    public boolean validProduct() {
        return productoIn != null;
    }

    /**
     * 
     * @implNote Funcion para agregar un producto al carrito
     * @return el String del producto agregado
     */
    public String getCartItemAdded() {
        String itemAdded = "";

        cart.add(productoIn);

        itemAdded = productoIn.getCodeM() + " - " + productoIn.getDepartM() + " - " + productoIn.getTotalM() + " - " + productoIn.getQuantityM();

        return itemAdded;
    }

    /**
     * @implNote funcion para obtener el Total del Carrito
     * @return el String del total del carrito
     */
    public String getCartTotal() {
        int totalCart = 0;

        totalCart += cart.size();

        // for(int i = 0; i < cart.size(); i++) {
        //     totalCart += cart.get(i).getTotalM();
        //     System.out.println("TotalProducto" + cart.get(i).getTotalM());
        //     System.out.println("TotalSUmando" + totalCart);
        // }


        for (Producto producto : cart) {
            totalCart += producto.getTotalM();
            
            System.out.println("TotalProducto" + producto.getTotalM());
            System.out.println("TotalSUmando" + totalCart);
        }

        return "" + totalCart;
    }

    /**
     * 
     * @implNote Funcion para obtener el SubTotal del carrito
     */
    public String getSubTotal() {
        return "" + productoIn.getSubTotalM();
    }

    /**
     * 
     * @implNote Funcion para obtener el Total del carrito
     */
    public String getTotal() {
        return "" + productoIn.getTotalM();
    }

    /**
     * 
     * @implNote Funcion para limpiar el producto en cola
     */
    public void clsProductoIn() {
        productoIn = null;
    }

    /**
     * 
     * @implNote Funcion para vaciar el carrito
     */
    public void clsCart() {
        cart.clear();
    }
}
