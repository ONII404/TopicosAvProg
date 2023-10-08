package lib.components;

import java.util.ArrayList;

public class Cart {
    
    private ArrayList<Producto> cart = new ArrayList<Producto>();
    private double totalCart;

    public Cart() {
    }

    /**
     * 
     * @param producto producto a agregar al carrito
     */
    public void addProduct(Producto producto) {
        cart.add(producto);
    }

    /**
     * 
     * @param productoIndex indice del producto a eliminar
     */
    public void removeProduct(int productoIndex) {
        System.out.println("Tamaño del carrito: " + cart.size());

            System.out.println("Producto eliminado: " + cart.get(productoIndex).codeM);
            cart.remove(productoIndex);

    }

    /**
     * 
     * @implNote Función para limpiar el carrito
     */
    public void clearCart() {
        cart.clear();
    }

    /**
     * 
     * @return Retorna el tamaño del carrito
     */
    public int getSize() {
        return cart.size();
    }

    /**
     * 
     * @return Retorna el total del carrito
     */
    public double getTotalCart() {
        totalCart = 0;
        for (Producto producto : cart) {
            totalCart += producto.getTotalM();
        }
        return totalCart;
    }

    /**
     * 
     * @return Retorna el carrito como String[]
     */
    public String[] getCart() {
        String[] cartArray = new String[cart.size()];
        int i = 0;
        for (Producto producto : cart) {
            
            cartArray[i] = producto.getCodeM() + " - " + producto.getDepartM() + " - " + producto.getQuantityM() + " - " + producto.getTotalM();
            System.out.println(cartArray[i]);
            i++;
        }
        return cartArray;
    }

}
