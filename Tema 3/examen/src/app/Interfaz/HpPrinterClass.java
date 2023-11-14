package app.Interfaz;


/**
 *
 * @author ONII404
 */
public class HpPrinterClass implements  Runnable{
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

//    public HpPrinterClass() {
//
//    }

    private synchronized void printData() {
        System.out.println(name + " Tiempo restante: " + timeToPrint() + " Modo: " + modePrint());
    }

    // Calcular tiempo
    private synchronized double timeToPrint() {

        double time = 0.0;

        if (tipo == 1) {
            time = pagPrint / 27;
        } else if (tipo == 2) {
            time = pagPrint / 6;
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
