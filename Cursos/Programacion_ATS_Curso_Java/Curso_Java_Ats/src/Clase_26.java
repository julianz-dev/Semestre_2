
/*
Ejercicio 13: Hacer un programa que simule un cajero automático con un saldo inicial de 1000 Dólares, con el siguiente menú de opciones:

1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir 
*/

import javax.swing.JOptionPane;

public class Clase_26 {
    public static void main(String[] args) {

        double saldo = 1000, valor, totalSaldo;
        int opcion;

        opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Seleccione la opcion deseada:\n1. Ingresar dinero.\n2. Retirar dinero.\n3. Salir del menu.\n"
                        + "\n(Su saldo actual es de $" + saldo+")\n \n"));

        switch (opcion) {
            case 1:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a ingresar:"));
                totalSaldo = saldo + valor;
                JOptionPane.showMessageDialog(null, "Deposito exitoso.");
                JOptionPane.showMessageDialog(null, "Su nuevo saldo es:\n" + totalSaldo);
                break;
            case 2:
                valor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a retirar:"));
                if (valor > saldo) {
                    JOptionPane.showMessageDialog(null,
                            "Valor no valido.\nEl monto a retirar, no puede ser mayor que tu saldo actual:\n$" + saldo);
                } else {
                    totalSaldo = saldo - valor;
                    JOptionPane.showMessageDialog(null, "Retiro exitoso.\nPresione Enter para continuar.");
                    JOptionPane.showMessageDialog(null, "Su nuevo saldo es:\n" + totalSaldo);
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción no valida, favor iniciar de nuevo el menu.");
                break;
        }
    }
}