package lib;

import java.util.HashMap;
import java.util.Map;

public class libP9 {

    // Traducciones español a Ingles, Italiano y Aleman
    private Map<String, String> tlsMap = new HashMap<String, String>() {
        {
            put("HolaEn", "Hello"); // Hola
            put("HolaIt", "Ciao");
            put("HolaAl", "Hallo");

            put("AdiosEn", "Goodbye"); // Adios
            put("AdiosIt", "Addio");
            put("AdiosAl", "Auf Wiedersehen");

            put("PuertaEn", "Door"); // Puerta
            put("PuertaIt", "Porta");
            put("PuertaAl", "Tür");

            put("VentanaEn", "Window"); // Ventana
            put("VentanaIt", "Finestra");
            put("VentanaAl", "Fenster");

            put("RatónEn", "Mouse"); // Ratón
            put("RatónIt", "Topo");
            put("RatónAl", "Maus");

            put("AutomovilEn", "Car"); // Automovil
            put("AutomovilIt", "Automobile");
            put("AutomovilAl", "Auto");

            put("CasaEn", "House"); // Casa
            put("CasaIt", "Casa");
            put("CasaAl", "Haus");
        }
    };

    /**
     * 
     * @param txt Texto a Traducir
     * @param tls Idioma
     * @return Traducción
     */
    public String getTlsTxt(String txt, String tls) {
        return tlsMap.get(txt + tls);
    }
}
