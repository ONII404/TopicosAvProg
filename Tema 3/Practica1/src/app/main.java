package app;

import app.components.RunnableClass;
import app.components.ThreadClass;

/**
 *
 * @author ONII404
 */
public class main {

    public static void main(String[] args) {
        // Thread Heredado
        ThreadClass hilo1 = new ThreadClass(5, 5, 5);
        hilo1.start();

        // Thread Implementado(Interfaz Runnable)
        RunnableClass hilo2 = new RunnableClass(5, 5, 5);
        Thread h1 = new Thread(hilo2);
        h1.start();
    }
}
