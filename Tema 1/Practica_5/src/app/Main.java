package app;

// importamos los componentes
import app.components.FrameClassC1;
import app.components.FrameClassC2;
import app.components.FrameClassC3;
import app.components.FrameClassC4;

/**
 * 
 * @autor: ONII404
 */

public class Main {
   public static void main(String[] args) {

       /*
        * 0: FrameClassC1
        * 1: FrameClassC2
        * 2: FrameClassC3 (Bucles)
        * 3: FrameClassC4 (Bucles)
        */

       int frame = 3;

       switch (frame) {
           case 0:
               // FrameClassC1 es una clase que solo calcula el promedio de 4 calificaciones
               FrameClassC1 objFrameClassC1 = new FrameClassC1();
               objFrameClassC1.setVisible(true);
               break;
           case 1:
               // FrameClassC2 es una clase que calcula el promedio de 4 calificaciones y tiene
               // efectos de colores
               FrameClassC2 objFrameClassC2 = new FrameClassC2();
               objFrameClassC2.setVisible(true);
               break;
           case 2:
               // FrameClassC3 es una clase que calcula el promedio de 5 calificaciones (Bucles)
               FrameClassC3 objFrameClassC3 = new FrameClassC3();
               objFrameClassC3.setVisible(true);
               break;
           case 3:
               // FrameClassC4 es una clase que calcula el promedio de 6 calificaciones y tiene (Bucles)
               FrameClassC4 objFrameClassC4 = new FrameClassC4();
               objFrameClassC4.setVisible(true);
               break;
           default:
               break;
       }
   }
}
