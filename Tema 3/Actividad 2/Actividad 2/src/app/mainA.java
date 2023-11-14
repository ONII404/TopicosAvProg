package app;

import app.thread.TerrenoA;
import app.thread.TerrenoB;

/**
 *
 * @author ONII404
 */
public class mainA {
    public static void main(String[] args) {
        TerrenoA h1 = new TerrenoA(5, 2, 6, 2);
        TerrenoA h2 = new TerrenoA(10, 4, 9, 2);
        TerrenoB h3 = new TerrenoB(4, 3, 5);
        TerrenoB h4 = new TerrenoB(5, 2, 6);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
    }
}
