package lib;

import lib.components.Producto;
import lib.components.Validator;
import lib.components.Cart;
import java.util.ArrayList;
import javax.swing.ButtonModel;

public class LibP10 {

    private Producto productoIn;
    Cart cartClass = new Cart();
    // private ArrayList<Producto> cart = new ArrayList<Producto>();

    /**
     * 
     * @implNote Función para validar los datos del producto
     * 
     * @param codeM codigo del producto
     * @param depMerch departamento del producto
     * @param priceM precio del producto
     * @param quantity cantidad de productos
     * @param isrM impuesto del producto [ButtonModel]
     * @param discountM descuento
     * @return true si los datos son válidos, false en caso contrario
     */
    public boolean setProductoIn(String codeM, String depMerch, String priceM, String quantity, ButtonModel isrM, String discountM) {

        Validator validate = new Validator();
        boolean valido = validate.validateData(codeM, depMerch, priceM, quantity, isrM, discountM);

        if (valido == true) {
            addProductIn(codeM, depMerch, priceM, quantity, isrM, discountM);
        }
        return valido;
    }
    
    private void addProductIn(String codeM, String depMerch, String priceM, String quantity, ButtonModel isrM, String discountM) {
        productoIn = new Producto(codeM, depMerch, priceM, quantity, isrM, discountM);
    }

    /**
     * 
     * @implNote Función para validar si hay un producto en la cola
     */
    public boolean validProduct() {
        return productoIn != null;
    }

    /**
     * 
     * @implNote Función para obtener el SubTotal del Producto en cola
     */
    public String getSubTotal() {
        return "" + productoIn.getSubTotalM();
    }

    /**
     * 
     * @implNote Función para obtener el Total del Producto en cola
     */
    public String getTotal() {
        return "" + productoIn.getTotalM();
    }

    /**
     * 
     * @implNote Función para limpiar el producto en cola
     */
    public void clsProductoIn() {
        productoIn = null;
    }



/*
 * 













 */



    /**
     * 
     * @implNote Función para agregar un producto al carrito
     */
    public void addToCart() {
        cartClass.addProduct(productoIn);
    }

    /**
     * 
     * @implNote Función para obtener el carrito
     * @return el String[] del carrito
     */
    public String[] getCart(){
        return cartClass.getCart();
    }

    /**
     * 
     * @implNote Función para obtener el Total del Carrito
     * @return Retorna el total del carrito como String
     */
    public String getCartTotal() {
        return "" + cartClass.getTotalCart();
    }

    /**
     * 
     * @param index Indice del producto a eliminar
     */
    public void rmvCartItem(int index) {
        cartClass.removeProduct(index);
    }

    /**
     * 
     * @implNote Función para vaciar el carrito
     */
    public void clsCart() {
        cartClass.clearCart();
    }
}
