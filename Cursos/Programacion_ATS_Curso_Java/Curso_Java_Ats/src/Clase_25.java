/*Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones aritméticas básicas 
(suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del
primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división. */

import javax.swing.JOptionPane;

public class Clase_25 {
    public static void main(String[] args) {

        char operacion;
        int num1, num2, resultado;

        operacion = JOptionPane.showInputDialog("Selecciones la operación a realizar:\nS = Suma\nR = Resta\nM = Multiplicación\nD = División").charAt(0);

        switch (operacion) {
            case 'S':
            case 's':
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                break;
            case 'r':
            case 'R':
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                break;
            case 'M':
            case 'm':
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                break;
            case 'd':
            case 'D':
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
                if (num2 == 0) {
                    JOptionPane.showMessageDialog(null, num2+" no es un numero divisible, ejecute nuevamente el programa.");
                    break;
                }
                else{
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la operación es: " + resultado);
                break;
                }
            default:
                JOptionPane.showMessageDialog(null,
                        "Operación no valida, para la operación debes seleecionar:\nS = Suma\nR = Resta\nM = Multiplicación\nD = División");
                break;
        }
    }

}