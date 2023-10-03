package lib;

/**
 *
 * @author ONII404
 */
public class libA2 {

    public String descPorsentaje(double precio){

        double descuento = 0;
        if (precio >= 200) {
            descuento = precio * 0.15;
            return descuento + " (15%)";
        } else if (precio > 100 && precio < 200) {
            descuento = precio * 0.12;
            return descuento + " (12%)";
        } else {
            descuento = precio * 0.10;
            return descuento + " (10%)";
        }
    }

    public double precioFinal(double precio) {
        double precioFinal = 0;
        if (precio >= 200) {
            precioFinal = precio - (precio * 0.15);
        } else if (precio > 100 && precio < 200) {
            precioFinal = precio - (precio * 0.12);
        } else if (precio < 100) {
            precioFinal = precio - (precio * 0.10);
        }
        return precioFinal;
    }
}
