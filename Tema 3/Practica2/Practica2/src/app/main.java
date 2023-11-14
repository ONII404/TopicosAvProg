package app;

import app.components.MultiClass;
import app.components.SumaClass;

/**
 *
 * @author ONII404
 */
public class main {

    public static void main(String[] args) {
        
        SumaClass h1 = new SumaClass(5, 5);
        SumaClass h2 = new SumaClass(5, 5, 5);
        MultiClass h3 = new MultiClass(5, 5);
        MultiClass h4 = new MultiClass(5, 5, 5);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();

    }

}
