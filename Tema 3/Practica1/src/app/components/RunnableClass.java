package app.components;

/**
 *
 * @author ONII404
 */
public class RunnableClass implements Runnable{

    double a, b, c, d, A, B, C, D;

    public RunnableClass(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void run() {
        calPerimetro(a, b, c);
        calArea(a, b);
    }

    private void calPerimetro(double a, double b, double c) {
        double perimetro = a + b + c;
        System.out.println("El perimetro de un triangulo es.. " + perimetro + " --> " + Thread.currentThread());
    }

    private void calArea(double a, double b) {

        double area = (a * b) / 2;
        System.out.println("El area de un triangulo es.. " + area + " --> " + Thread.currentThread());

    }

}
