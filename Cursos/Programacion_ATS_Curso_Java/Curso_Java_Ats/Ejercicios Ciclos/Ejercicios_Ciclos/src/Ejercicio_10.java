//* Pedir 10 números y escribir la suma total. */

import javax.swing.JOptionPane;

public class Ejercicio_10 {
    public static void main(String[] args) {

        int cantidadNumeros = 10;
        int numero;
        int suma = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero a sumar: "));
            suma += numero;
            cantidadNumeros--;
        } while (cantidadNumeros > 0);

        JOptionPane.showMessageDialog(null, "La suma total de los 10 números es:\n" + suma);

    }
}
