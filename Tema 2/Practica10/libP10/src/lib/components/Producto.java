package lib;

public class Producto {
    
    String cMerch;
    String depMerch;
    double totalPrice;
    int quantity;
    String Subtotal;

    // cart.add(new Producto(cMerch, depMerch, quantity, total));

    /**
     * 
     * @param cMerch codigo del producto
     * @param depMerch departamento del producto
     * @param total precio del producto
     * @param quantity cantidad de productos
     */
    public Producto(String cMerch, String depMerch, int quantity, double total) {
        this.cMerch = cMerch;
        this.depMerch = depMerch;
        this.quantity = quantity;
        this.totalPrice = total;
    }


    // Getters
    public String getcMerch() {
        return cMerch;
    }

    public String getDepMerch() {
        return depMerch;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    // Setters

    public void setcMerch(String cMerch) {
        this.cMerch = cMerch;
    }

    public void setDepMerch(String depMerch) {
        this.depMerch = depMerch;
    }

    public void setTotalPrice(double price) {
        this.totalPrice = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
