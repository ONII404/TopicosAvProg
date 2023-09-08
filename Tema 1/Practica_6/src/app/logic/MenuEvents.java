// package app.logic;

// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import java.awt.event.ItemEvent;
// import java.awt.event.ItemListener;

// import app.ui.components.displays.RestaDisplay;
// import app.ui.components.displays.SumaDisplay;


// /**
//  * 
//  * @ONII404
//  */

// public class MenuEvents {

//     // public int panelShow;

//     SumaDisplay sumaDisplay = new SumaDisplay();
//     RestaDisplay restaDisplay = new RestaDisplay();


//     public ActionListener getSumaEvent(){
//         ActionListener actionListener = new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 System.out.println("Suma");
//                 sumaDisplay.setVisible(true);
//                 restaDisplay.setVisible(false);
//             }
//         };
//         return actionListener;
//     }

//     // Metodo para obtener el evento de cada Boton de tipo Radio
//     public ActionListener getActionListener(int buttonID) {
//         ActionListener actionListener = null;
//         switch (buttonID) {
//             case 0:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Suma");
//                         sumaDisplay.setVisible(true);
//                     }
//                 };
//                 break;
//             case 1:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Resta");
//                     }
//                 };
//                 break;
//             case 2:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Multiplicacion");
//                     }
//                 };
//                 break;
//             case 3:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Division");
//                     }
//                 };
//                 break;
//             case 4:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Potencia");
//                     }
//                 };
//                 break;
//             case 5:
//                 actionListener = new ActionListener() {
//                     @Override
//                     public void actionPerformed(ActionEvent e) {
//                         System.out.println("Nada");
//                     }
//                 };
//                 break;
//             default:
//                 break;
//         }
//         return actionListener;
//     }

//     // ? Metodo para obtener el evento de cada Boton de tipo Check
//     public static ItemListener getOptionListener(int buttonID) {
//         ItemListener optionListener = null;

//         switch (buttonID) {
//             case 0:
//                 optionListener = new ItemListener() {
//                     @Override
//                     public void itemStateChanged(ItemEvent e) {
//                         if (e.getStateChange() == ItemEvent.SELECTED) {
//                             System.out.println("Modo de 2 decimales");

//                         } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//                             System.out.println("Modo de 2 desimales desactivado");
//                         }
//                     }
//                 };
//                 break;
//             case 1:
//                 optionListener = new ItemListener() {
//                     @Override
//                     public void itemStateChanged(ItemEvent e) {
//                         if (e.getStateChange() == ItemEvent.SELECTED) {
//                             System.out.println("Soporte para Numeros Negativos");

//                         } else if (e.getStateChange() == ItemEvent.DESELECTED) {
//                             System.out.println("Numeros Negativos desactivados");
//                         }
//                     }
//                 };
//                 break;
//             default:
//                 break;
//         }
//         return optionListener;
//     }

// }
