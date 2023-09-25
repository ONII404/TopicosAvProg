package lib;

/**
 *
 * @author ONII404
 */
public class myLibClass {

    // Realice un proyecto para determinar si una persona puede votar con base en su edad en las próximas elecciones.

    public String puedeVotar(int edad) {
        if (edad >= 18) {
            return "Puede votar";
        } else {
            return "No puede votar";
        }
    }


    // Realice un proyecto para determinar el sueldo semanal de un trabajador con base en las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada hora se considera como excedente y se paga el doble.

    public double sueldoSemanal(double horas, double pago) {
        if (horas <= 40) {
            return horas * pago;
        } else {
            return (40 * pago) + ((horas - 40) * (pago * 2));
        }
    }
}
