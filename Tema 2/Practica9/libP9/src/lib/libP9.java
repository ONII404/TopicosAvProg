package lib;

import java.util.HashMap;
import java.util.Map;

public class libP9 {

    // Traducciones español a Ingles, Italiano y Aleman
    private Map<String, String> tlsMap = new HashMap<String, String>() {
        {
            // Hola
            put("HolaEn", "Hello");
            put("HolaIt", "Ciao");
            put("HolaAl", "Hallo");

            // Adios
            put("AdiosEn", "Goodbye");
            put("AdiosIt", "Addio");
            put("AdiosAl", "Auf Wiedersehen");

            // Puerta
            put("PuertaEn", "Door");
            put("PuertaIt", "Porta");
            put("PuertaAl", "Tür");

            // Ventana
            put("VentanaEn", "Window");
            put("VentanaIt", "Finestra");
            put("VentanaAl", "Fenster");

            // Ratón
            put("RatónEn", "Mouse");
            put("RatónIt", "Topo");
            put("RatónAl", "Maus");

            // Automovil
            put("AutomovilEn", "Car");
            put("AutomovilIt", "Automobile");
            put("AutomovilAl", "Auto");

            // Casa
            put("CasaEn", "House");
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
