package app.thread;

/**
 *
 * @author ONII404
 */
public class TerrenoB extends Thread{
    
    double r, z, w, area, areaC, areaR;

    public TerrenoB(double r, double z, double w) {
        this.r = r;
        this.z = z;
        this.w = w;
    }
    
    public void run(){
        calArea();
        printData();
    }
    
    private void printData(){
        
        System.out.println("Hilo --> " + currentThread().getName()
        + "\nRadio: " + r + "\nBase: " + z + "\nAltura: " + w + "\nArea Terreno B: " + area + "\n"
        );
    
    }
    
    private void calArea(){
        areaC = 3.1416 * (r*r);
        areaR = z*w;
        area = (areaC / 2) + areaR;
    }
    
    
}
