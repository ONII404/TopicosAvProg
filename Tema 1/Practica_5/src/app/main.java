package app;

import app.recursos.FrameClassC1;
import app.recursos.FrameClassC2;

public class main {
    public static void main(String[] args) {

        //? FrameClassC1 es una clase que solo calcula el promedio de 4 calificaciones
        FrameClassC1 objFrameClassC1 = new FrameClassC1();
        objFrameClassC1.setVisible(true);

        //? FrameClassC2 es una clase que calcula el promedio de 4 calificaciones y tiene efectos de colores
        FrameClassC2 objFrameClassC2 = new FrameClassC2();
        objFrameClassC2.setVisible(true);
    }
}
