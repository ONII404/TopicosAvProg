package app.Interfaz;

/**
 *
 * @author ONII404
 */
public class EpsonPrinterClass implements Runnable{

    String name;
    int pagPrint, tipo;

    public void run() {
        printData();
    }

    public EpsonPrinterClass(String name, int pagPrnt, int tipo) {
        this.name = name;
        this.pagPrint = pagPrnt;
        this.tipo = tipo;
    }

//    public EpsonPrinterClass() {
//
//    }

    private synchronized void printData() {
        System.out.println(name + " Tiempo restante: " + timeToPrint() + " Modo: " + modePrint());
    }

    // Calcular tiempo
    private synchronized double timeToPrint() {

        double time = 0.0;

        if (tipo == 1) {
            time = pagPrint / 11;
        } else if (tipo == 2) {
            time = pagPrint / 5;
        }

        return time;
    }
    
    private synchronized String modePrint(){
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
