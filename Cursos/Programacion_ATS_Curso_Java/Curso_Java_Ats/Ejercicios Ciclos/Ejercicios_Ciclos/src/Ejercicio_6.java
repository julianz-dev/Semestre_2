//*Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos. */

import javax.swing.JOptionPane;

public class Ejercicio_6 {
    public static void main(String[] args) {

        int numero;
        int suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += numero;
        } while (numero != 0);

        JOptionPane.showMessageDialog(null, "La suma de los numeros ingresados es: \n"+suma);

    }
}