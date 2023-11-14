package app.components;

import java.util.Scanner;

/**
 *
 * @author ONII404
 */
public class reservaClass extends Thread {

    int matRoom = 5, matRoom2 = 5, indivRoom = 5, tipo;

    public void run() {
        
//        showDisp();
        setData();
        getDisp();
    }

    private synchronized void setData() {
        String nomCliente;
        int tipoCama;

        Scanner input = new Scanner(System.in);
        System.out.println("Nombre del cliente: ");
        nomCliente = input.next();

        System.out.println("Seleccione la Habitacion: \n1-. Cama matrimonial \n2-.Cama Matrimonial2 \n3-. Cama Individual");
        tipoCama = input.nextInt();
        this.tipo = tipoCama;

    }

    private synchronized void showDisp() {
        System.out.println("\nHilo " + currentThread().getName() + "\n");
        System.out.println("Habitacion Matrimonial: " + matRoom);
        System.out.println("Habitacion Matrimonial 2: " + matRoom2);
        System.out.println("Habitacion Individual " + indivRoom);
    }

    private synchronized void getDisp() {
        System.out.println("Disponibilidad: ");

        switch (tipo) {
            case 1:
                matRoom = matRoom - 1;

                break;
            case 2:
                matRoom2 = matRoom2 - 1;
                break;
            case 3:
                indivRoom = indivRoom - 1;
                break;
        }
        System.out.println("Habitacion Matrimonial: " + matRoom);
        System.out.println("Habitacion Matrimonial 2: " + matRoom2);
        System.out.println("Habitacion Matrimonial: " + indivRoom);
    }
}
