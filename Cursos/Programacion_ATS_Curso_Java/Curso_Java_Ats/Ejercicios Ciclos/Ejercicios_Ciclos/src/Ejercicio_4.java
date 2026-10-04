/*Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.*/

import javax.swing.JOptionPane;

public class Ejercicio_4 {
    public static void main(String[] args) {

        int numero, contador=0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while (numero >= 0) {
            contador++;
            JOptionPane.showMessageDialog(null, "Cantidad de numeros validos introducidos: \n"+contador);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        JOptionPane.showMessageDialog(null, "Cantidad de numeros validos introducidos: \n"+contador);
    }
}
