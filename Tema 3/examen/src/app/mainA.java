package app;

import app.threads.EpsonPrinterClass;
import app.threads.HpPrinterClass;

/**
 *
 * @author ONII404
 */
public class mainA {

    public static void main(String[] args) {

        EpsonPrinterClass hEpsonLote1 = new EpsonPrinterClass("Lote 1", 115, 1);
        EpsonPrinterClass hEpsonLote2 = new EpsonPrinterClass("Lote 2", 120, 2);
        
        HpPrinterClass hHpLote3 = new HpPrinterClass("Lote 3", 170, 1);
        HpPrinterClass hHpLote4 = new HpPrinterClass("Lote 4", 410, 2);
        
        hEpsonLote1.start();
        hEpsonLote2.start();
        hHpLote3.start();
        hHpLote4.start();
    }
}
