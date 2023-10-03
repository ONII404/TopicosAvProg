package lib;

/**
 *
 * @author ONII404
 */
public class libP7 {

    /**
     * 
     * @param tipo = Tipo de Uva
     * @param size = Tamaño de Uva
     * @param price = Precio de Uvas
     * @param kg = Kilos de la compra
     * @return La Ganancia
     */
    public String Ganancia(String tipo, String size, double price, double kg) {

        double gain = 0;
        switch (tipo) {
            case "A":
                if (size.equals("1")) {
                    // donde A es 1
                    price += .20;
                    gain = price * kg;
                } else {
                    // Donde A es 2
                    price += .30;
                    gain = price * kg;
                }
                break;
            case "B":
                if (size.equals("1")) {
                    // Donde B es 1
                    price -= .30;
                    gain = price * kg;
                } else {
                    // Donde B es 2
                    price -= .50;
                    gain = price * kg;
                }
                break;
            default:
                System.out.print("¡Sin selección!");
        }
        return gain + "";
//        return getGain(tipo, size, price, kg);
    }

    
    /**
     * 
     * @param tipo = Tipo de Uva
     * @param size = Tamaño de Uva
     * @param price = Precio de Uvas
     * @param kg = Kilos de la compra
     * @return La Ganancia
     */
    private String getGain(String tipo, String size, double price, double kg) {
        double gain = 0;
        if (tipo.equals("A")) {
            if (size.equals("1")) {
                // donde A es 1
                price += .20;
                gain = price * kg;
            } else {
                // Donde A es 2
                price += .30;
                gain = price * kg;
            }

        } else if (tipo.equals("B")) {
            if (size.equals("1")) {
                // Donde B es 1
                price -= .30;
                gain = price * kg;
            } else {
                // Donde B es 2
                price -= .50;
                gain = price * kg;
            }
        }
        return gain + "";
    }

}
