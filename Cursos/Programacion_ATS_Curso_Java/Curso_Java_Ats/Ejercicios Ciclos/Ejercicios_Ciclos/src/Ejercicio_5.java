/*Ejercicio 5: Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, 
y luego ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. 
El proceso termina cuando el usuario acierta y mostrar el número de intentos. */

import javax.swing.JOptionPane;

public class Ejercicio_5 {
    public static void main(String[] args) {
        int numeroSecreto = (int)(Math.random() * 101);
        int numeroUsuario;
        int intentos = 0;

        numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog
            ("Bienvenido al juego Adivina Un Numero.\nPara empezar, digite un numero entre 0 y 100: "));

        intentos++;
            while (numeroUsuario != numeroSecreto) {            
            if (numeroUsuario > numeroSecreto) {
                JOptionPane.showMessageDialog(null, "El numero es menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "El numero es mayor");
            }
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Numero de intentos: "+intentos+"\nDigite un numero entre 0 y 100"));
            intentos++;
        }
        JOptionPane.showMessageDialog(null, "Lo has logrado!!\nNumero de intentos: " + intentos);
    }
}
