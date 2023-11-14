package app.runnable;

/**
 *
 * @author ONII404
 */
public class TerrenoA implements Runnable{
    double x, y, z, w, area, areaT, AreaR;

    public TerrenoA(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    public void run() {
        triangulo();
        printData();
    }

    private void printData() {
        System.out.println("Hilo --> " + Thread.currentThread().getName() + "\nBase Triangulo " + x + "\nAltura Trinagulo: " + y
                + "\nBase Rectangulo: " + z + "\nAltura Rectangulo: " + w + "\nArea Terreno A: " + area + "\n"
        );
    }

    private void triangulo() {
        areaT = (x * y) / 2;
        AreaR = z * w;
        area = areaT + AreaR;
    }
}
