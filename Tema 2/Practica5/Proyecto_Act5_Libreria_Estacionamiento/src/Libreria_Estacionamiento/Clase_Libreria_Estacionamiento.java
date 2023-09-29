package Libreria_Estacionamiento;

/**
 *
 * @author nombte estudiante
 */
public class Clase_Libreria_Estacionamiento {

    public String calCostoEstaci(int horas) {

//        int precioHora;
        int coste = 0;
//        int inte = 0;

        switch (horas) {
            case 1:
                coste = 5;
                break;
            case 2:
                coste = 10;
                break;
            case 3:
                coste = 14;
                break;
            case 4:
                coste = 18;
                break;
            case 5:
                coste = 22;
                break;
            case 6:
                coste = 25;
                break;
            case 7:
                coste = 28;
                break;
            case 8:
                coste = 31;
                break;
            case 9:
                coste = 34;
                break;
            case 10:
                coste = 37;
                break;
            default:
                coste = 37 + (2 *(horas - 10));
        }

//        if (horas <= 2) {
//            precioHora = 5;
//
//            coste += horas * precioHora;
//        }
//
//        if (horas >= 3 && horas <= 5) {
//            precioHora = 4;
//
//            inte = coste;
//            inte += (horas) * precioHora;
//            coste = inte - coste;
//        }
//
//        if (horas >= 6 && horas <= 10) {
//            precioHora = 3;
//            coste += (horas - 5) * precioHora;
//        }
//
//        if (horas > 10) {
//            precioHora = 2;
//            coste += (horas - 10) * precioHora;
//        }

        return coste + "";
    }
}
