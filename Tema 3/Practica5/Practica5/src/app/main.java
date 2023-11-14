package app;

import app.thread.EdadesClass;
import app.thread.EstaturaClass;


/**
 *
 * @author ONII404
 */
public class main {
    
    public static void main(String[] args) {
        
        EdadesClass h1 = new EdadesClass();
        EstaturaClass h2 = new EstaturaClass();
        
        h1.start();
        h2.start();
        
    }
}
