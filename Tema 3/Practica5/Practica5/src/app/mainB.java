package app;

import app.runnable.EdadesClass;
import app.runnable.EstaturaClass;

/**
 *
 * @author ONII404
 */
public class mainB {

    public static void main(String[] args) {
        EdadesClass edadesClass = new EdadesClass();
        EstaturaClass estaturaClass = new EstaturaClass();

        Thread h1 = new Thread(edadesClass);
        Thread h2 = new Thread(estaturaClass);

        h1.start();
        h2.start();
    }
}
