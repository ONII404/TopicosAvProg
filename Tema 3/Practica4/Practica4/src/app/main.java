package app;

import app.components.reservaClass;

/**
 *
 * @author ONII404
 */
public class main {
    
    public static void main(String[] args) {
        
        reservaClass resClass = new reservaClass();
        Thread h1 = new Thread(resClass);
        Thread h2 = new Thread(resClass);
        Thread h3 = new Thread(resClass);
        Thread h4 = new Thread(resClass);
        Thread h5 = new Thread(resClass);
        Thread h6 = new Thread(resClass);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
    }   
}
