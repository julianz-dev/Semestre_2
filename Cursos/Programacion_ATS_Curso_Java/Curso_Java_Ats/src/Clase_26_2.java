/*
Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.

1. Hectogramo (hg): 100 gramos.
2. Decagramo (dag): 10 gramos.
3. Gramo (g): Unidad base del sistema
*/

import javax.swing.JOptionPane;

public class Clase_26_2 {
    public static void main(String[] args) {

        int unidad, peso, conversion;

        unidad = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al conversor de unidad de medida.\n"
            +"\nSeleccione la unidad de medida deseada para convertir:\n"
            +"1. Hectogramos (hg).\n"
            +"2. Decagramos (dag).\n"
            +"3. Gramos (g).\n \n"));

        if (unidad >=1 && unidad <=3 ) {

            peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso en Kilogramo (kg) que desea convertir:"));

            switch (unidad) {
                case 1:
                    conversion = peso*10;
                    JOptionPane.showMessageDialog(null, peso+" Kilogramos (kg), equivalen a "+conversion+" Hectogramos (hg).");
                    break;
                case 2:
                    conversion = peso*100;
                    JOptionPane.showMessageDialog(null, peso+" Kilogramos (kg), equivalen a "+conversion+" Decagramos (dag).");
                    break;
                case 3:
                    conversion = peso*1000;
                    JOptionPane.showMessageDialog(null, peso+" Kilogramos (kg), equivalen a "+conversion+" Gramos (g).");
                    break;
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Opción no valida.");
        }
    }
}