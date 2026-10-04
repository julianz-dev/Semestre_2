/*Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. */

import javax.swing.JOptionPane;

public class Ejercicio_3 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para el sistema indicar si es par o impar"));

        while (numero != 0) {
            if (numero % 2 == 0) {
                JOptionPane.showMessageDialog(null, numero+" es numero par.");
            }
            else {
                JOptionPane.showMessageDialog(null, numero+" es numero impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero para el sistema indicar si es par o impar"));
        }
    }
}
