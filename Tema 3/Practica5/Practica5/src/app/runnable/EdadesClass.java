package app.runnable;

/**
 *
 * @author ONII404
 */
public class EdadesClass implements  Runnable{
    double prom;
    int edades[] = {10, 15, 20, 35, 28, 16, 25, 36, 20, 10};

    public void run() {
        init();
    }

    private synchronized void init(){
        System.err.println("Hilo --> " + Thread.currentThread().getName());
        calPromedioEdades();
        printEdades();
    }
    
    
    private synchronized void calPromedioEdades() {
        int sumEda = 0;
        for (int edad : edades) {
            sumEda = sumEda + edad;
        }
        prom = sumEda / edades.length;
    }
    
    private synchronized void printEdades(){
        
        System.out.println("Edades: ");
        for (int edad : edades) {
            System.out.println(edad);
        }
    
        System.out.println("Promedio de Edades: " + prom);
    }
}
