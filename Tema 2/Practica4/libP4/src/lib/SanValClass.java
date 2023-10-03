package lib;

/**
 *
 * @author ONII404
 */
public class SanValClass {

    public String tipoRegalo(double pres) {

        if (pres <= 10) {
            return "Tarjeta";
        } else if (pres >= 11 && pres <= 100) {
            return "Chocolates";
        } else if (pres >= 101 && pres <= 250) {
            return "FLores";
        } else {
            return "Anillo";
        }
    }

}
