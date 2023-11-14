package app.threads;

/**
 *
 * @author ONII404
 */
public class HpPrinterClass extends Thread{
    String name;
    int pagPrint, tipo;

    public void run() {
        printData();
    }

    public HpPrinterClass(String name, int pagPrnt, int tipo) {
        this.name = name;
        this.pagPrint = pagPrnt;
        this.tipo = tipo;
    }

    private synchronized void printData() {
        System.out.println(name + " Tiempo restante: " + timeToPrint() + " Modo: " + modePrint());
    }

    // Calcular tiempo
    private double timeToPrint() {

        double time = 0.0;

        if (tipo == 1) {
            time = pagPrint / 27;
        } else if (tipo == 2) {
            time = pagPrint / 6;
        }

        return time;
    }
    
    private String modePrint(){
        String mode = "";
        if (tipo == 1) {
            mode = "Blano y negro";
        }
        else if(tipo == 2){
            mode = "Color";
        }
            
        return mode;
    }
    
}
