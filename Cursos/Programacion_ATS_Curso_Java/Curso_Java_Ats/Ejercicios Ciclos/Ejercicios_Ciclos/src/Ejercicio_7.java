//*Pedir números hasta que se introduzca uno negativo, y calcular la media. */

import javax.swing.JOptionPane;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int numero;
        int contador = 0;
        int suma = 0;
        double media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para iniciar y sacar la media: "));

        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero para sacar la media: "));
        }

        if (contador == 0) {
            JOptionPane.showMessageDialog(null, "No se puede calcular la media porque no se ingresaron números válidos.");
        } else {
            media = (double) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de los numeros ingresados es: " + media);
        }

    }
}