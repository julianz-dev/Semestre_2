//*Pedir un número N, y mostrar todos los números del 1 al N. */

import javax.swing.JOptionPane;

public class Ejercicio_8 {
    public static void main(String[] args) {
        int numeroN;
        int contador = 1;

        numeroN = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if (numeroN <= 0) {
            System.out.println("Numero no valido, debe ser mayor a 0");
        } else {
            while (contador <= numeroN) {
                System.out.println(contador);
                contador++;
            }

        }
    }
}