package app.components;

/**
 *
 * @author ONII404
 */
public class MultiClass extends Thread{
    int x, y, z, option;

    public MultiClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        option = 3;
    }

    public MultiClass(int x, int y) {
        this.x = x;
        this.y = y;
        option = 2;
    }

    public void run() {
        int result = 0;
        if (option == 2) {
            result = x * y;
        } else if (option == 3) {
            result = x * y * z;
        }
        System.out.println("Datos:\n x = " + x + "\n x = " + y + "\n z = " + z 
                + "\n Multiplicacion: " + result + "\n Hilo --> " + getThreadName() + "\n");
    }
    
    
    private String getThreadName(){
        String nameTread = Thread.currentThread().getName();
        return nameTread;
    }
}
