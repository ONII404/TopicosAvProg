package app;

import app.runnable.TerrenoA;
import app.runnable.TerrenoB;

/**
 *
 * @author ONII404
 */
public class mainB {

    public static void main(String[] args) {
        TerrenoA terrenoA = new TerrenoA(5, 2, 6, 2);
        TerrenoA terrenoA1 = new TerrenoA(10, 4, 9, 2);
        TerrenoB terrenoB = new TerrenoB(4, 3, 5);
        TerrenoB terrenoB1 = new TerrenoB(5, 2, 6);

        Thread h1 = new Thread(terrenoA);
        Thread h2 = new Thread(terrenoA1);
        Thread h3 = new Thread(terrenoB);
        Thread h4 = new Thread(terrenoB1);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
