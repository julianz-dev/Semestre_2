/*Pedir una nota de 0 a 10 y mostrarla de la forma:

Insuficiente, Suficiente, Bien, Notable y Sobresaliente. */

//0 - 4   → Insuficiente
//5       → Suficiente
//6       → Bien
//7 - 8   → Notable
//9 - 10  → Sobresaliente

import javax.swing.JOptionPane;

public class Clase_25_2 {
    public static void main(String[] args) {

        int nota;

        nota = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite una nota entre 0 y 10"));

        if (nota >=0 && nota < 5) {
            JOptionPane.showMessageDialog(null, "Insuficiente");
        }
        else if (nota < 6) {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        else if (nota < 7) {
            JOptionPane.showMessageDialog(null, "Bien");
        }
        else if (nota < 9) {
            JOptionPane.showMessageDialog(null, "Notable");
        }
        else if (nota <= 10) {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
        else{
            JOptionPane.showMessageDialog(null, "Valor no valido");
        }
    }

}
