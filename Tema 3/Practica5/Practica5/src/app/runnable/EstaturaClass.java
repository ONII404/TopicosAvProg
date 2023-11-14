package app.runnable;

/**
 *
 * @author ONII404
 */
public class EstaturaClass implements Runnable{

    double esMay;
    double estaturas[] = {1.80, 1.65, 1.82, 1.54, 1.65, 1.58, 1.81, 1.86, 1.65, 1.56};

    public void run() {
        init();
    }

    private synchronized void init() {
        System.err.println("Hilo --> " + Thread.currentThread().getName());
        calEstaturaMayor();
        System.out.println("Mayor estatura: " + esMay);
    }

    private synchronized void calEstaturaMayor() {
        System.out.println("Estaturas: ");
        for (double estatura : estaturas) {

            System.out.println(estatura);
            if (esMay < estatura) {
                esMay = estatura;
            }
        }
    }
}
