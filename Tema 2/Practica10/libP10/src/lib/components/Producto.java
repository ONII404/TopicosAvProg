package lib.components;

import javax.swing.ButtonModel;

/**
 * 
 * @author ONII404
 */
public class Producto {

    String codeM, departM;
    int quantityM, descuentoM;
    double priceM, SubTotalM, TotalM;
    ButtonModel isr;

    /**
     * Constructor de la clase Producto
     * 
     * @param codeM      Codigo del producto
     * @param departM    Departamento del producto
     * @param priceM     Precio del producto
     * @param quantityM  Cantidad de productos
     * @param isr        ISR del producto
     * @param descuentoM Descuento del producto
     * @param SubTotalM  Subtotal de la compra
     * @param TotalM     Total de la compra
     */
    public Producto(String codeM, String departM, String priceM, String quantityM, ButtonModel isr, String descuentoM) {
        this.codeM = codeM;
        this.departM = departM;
        this.priceM = Double.parseDouble(priceM);
        this.quantityM = Integer.parseInt(quantityM);
        this.isr = isr;
        this.descuentoM = Integer.parseInt(descuentoM);

        this.SubTotalM = calculateSubTotal();
        this.TotalM = calculateTotal();

    };

    private double calculateSubTotal() {
        return priceM * quantityM;
    }


    private double calculateTotal() {

        String rBtn = isr.getActionCommand();
        double isrRate = 0.0;
        double total = 0.0;

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

        double calculateIsr = SubTotalM * isrRate;
        double calcDEsc = (SubTotalM + calculateIsr) * descuentoM / 100.0;
        total = (SubTotalM + calculateIsr) - calcDEsc;

        String total2 =  String.format("%.2f", total);
        total = Double.parseDouble(total2);
        return total;
    }

    public String getCodeM() {
        return codeM;
    }

    public void setCodeM(String codeM) {
        this.codeM = codeM;
    }

    public String getDepartM() {
        return departM;
    }

    public void setDepartM(String departM) {
        this.departM = departM;
    }

    public int getQuantityM() {
        return quantityM;
    }

    public void setQuantityM(int quantityM) {
        this.quantityM = quantityM;
    }

    public int getDescuentoM() {
        return descuentoM;
    }

    public void setDescuentoM(int descuentoM) {
        this.descuentoM = descuentoM;
    }

    public double getPriceM() {
        return priceM;
    }

    public void setPriceM(double priceM) {
        this.priceM = priceM;
    }

    public double getSubTotalM() {
        return SubTotalM;
    }

    public void setSubTotalM(double SubTotalM) {
        this.SubTotalM = SubTotalM;
    }

    public double getTotalM() {
        return TotalM;
    }

    public void setTotalM(double TotalM) {
        this.TotalM = TotalM;
    }

    public ButtonModel getIsr() {
        return isr;
    }

    public void setIsr(ButtonModel isr) {
        this.isr = isr;
    }

}
