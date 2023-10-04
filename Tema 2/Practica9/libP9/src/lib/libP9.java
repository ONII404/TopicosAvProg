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
//        return getTls(txt, tls);
    }

    /*
     * 
     */

    public String getTls(String txt, String tls) {

        String txtTls = "";

        if (txt.equals("Hola")) {
            if (tls.equals("En")) {
                txtTls = "Hello";
            } else if (tls.equals("It")) {
                txtTls = "Ciao";
            } else if (tls.equals("Al")) {
                txtTls = "Hallo";
            }
        }

        if (txt.equals("Adios")) {
            if (tls.equals("En")) {
                txtTls = "Goodbye";
            } else if (tls.equals("It")) {
                txtTls = "Addio";
            } else if (tls.equals("Al")) {
                txtTls = "Auf Wiedersehen";
            }
        }

        if (txt.equals("Puerta")) {
            if (tls.equals("En")) {
                txtTls = "Door";
            } else if (tls.equals("It")) {
                txtTls = "Porta";
            } else if (tls.equals("Al")) {
                txtTls = "Tür";
            }
        }

        if (txt.equals("Ventana")) {
            if (tls.equals("En")) {
                txtTls = "Window";
            } else if (tls.equals("It")) {
                txtTls = "Finestra";
            } else if (tls.equals("Al")) {
                txtTls = "Fenster";
            }
        }

        if (txt.equals("Ratón")) {
            if (tls.equals("En")) {
                txtTls = "Mouse";
            } else if (tls.equals("It")) {
                txtTls = "Topo";
            } else if (tls.equals("Al")) {
                txtTls = "Maus";
            }
        }

        if (txt.equals("Automovil")) {
            if (tls.equals("En")) {
                txtTls = "Car";
            } else if (tls.equals("It")) {
                txtTls = "Automobile";
            } else if (tls.equals("Al")) {
                txtTls = "Auto";
            }
        }

        if (txt.equals("Casa")) {
            if (tls.equals("En")) {
                txtTls = "House";
            } else if (tls.equals("It")) {
                txtTls = "Casa";
            } else if (tls.equals("Al")) {
                txtTls = "Haus";
            }
        }
        return txtTls;
    }
}