//*Pedir un número y calcular su factorial. */

import javax.swing.JOptionPane;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int numero;
        int contador = 1;
        long factorial = 1;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el factorial que desea calcular: "));

        while (numero >= contador) {
            factorial *= contador;
            contador++;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}