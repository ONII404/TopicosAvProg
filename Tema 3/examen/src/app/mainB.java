package app;

import app.Interfaz.EpsonPrinterClass;
import app.Interfaz.HpPrinterClass;

/**
 *
 * @author ONII404
 */
public class mainB {
    
    public static void main(String[] args) {
        
        EpsonPrinterClass hEpsonLote1 = new EpsonPrinterClass("Lote1", 115, 1);
        EpsonPrinterClass hEpsonLote2 = new EpsonPrinterClass("Lote2", 120, 2);
        Thread h1 = new Thread(hEpsonLote1);
        Thread h2 = new Thread(hEpsonLote2);
        
        HpPrinterClass hHpLote3 = new HpPrinterClass("Lote 3", 170, 1);
        HpPrinterClass hHpLote4 = new HpPrinterClass("Lote 4", 410, 2);
        Thread h3 = new Thread(hHpLote3);
        Thread h4 = new Thread(hHpLote4);
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        
        
    }
    
}
