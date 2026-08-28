/*Ejercicio integrador: Cajero automático

Construye un programa que simule un cajero automático con un saldo inicial de $1.000.000.

El programa debe mostrar un menú:

===== CAJERO AUTOMÁTICO =====
1. Consultar saldo
2. Depositar dinero
3. Retirar dinero
4. Convertir saldo a dólares
5. Salir

El usuario debe seleccionar una opción.

Opción 1 — Consultar saldo
Mostrar el saldo actual.
=============================================================================================================
Opción 2 — Depositar dinero
Pedir cuánto dinero desea depositar.
El depósito debe ser mayor que $0.
Si introduce un valor inválido, mostrar un mensaje de error.
Si es válido, mostrar el nuevo saldo.
=============================================================================================================
Opción 3 — Retirar dinero
Pedir cuánto dinero desea retirar.
El retiro debe cumplir:
Ser mayor que $0.
No superar el saldo disponible.
Si intenta retirar más dinero del disponible:
Fondos insuficientes.
Si el valor es válido, mostrar el nuevo saldo.
=============================================================================================================
Opción 4 — Convertir saldo a dólares
Supongamos que:
1 USD = $4.000 COP
Debes convertir el saldo actual de pesos colombianos a dólares.
Por ejemplo:
Saldo: $1.000.000 COP
1.000.000 / 4.000 = 250 USD
Muestra ambos valores.
=============================================================================================================
Opción 5 — Salir
Mostrar:
Gracias por utilizar nuestro cajero automático.
=============================================================================================================
Opción inválida
Si introduce algo diferente de 1, 2, 3, 4 o 5:
Opción no válida. */

import javax.swing.JOptionPane;

public class Ejercicio_GP_Condicionales {
    public static void main(String[] args) {
        
        int opcion;
        double saldo = 1000000, saldoActual, valor;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a nuestro cajero automatico.\nPor favor selecciona una opción:\n"
        +"1. Consultar saldo.\n"
        +"2. Depositar dinero.\n"
        +"3. Retirar dinero.\n"
        +"4. Convertir saldo a dólares.\n"
        +"5. Salir."));

        if (opcion >= 1 && opcion <= 5) {
            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Operación exitosa.\nSaldo actual:\n$"+saldo);
                    break;
                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a depositar: "));
                    if (valor > 0) {
                        saldoActual = saldo + valor;
                        JOptionPane.showMessageDialog(null, "Operación exitosa.\nSaldo actual:\n$"+saldoActual);
                        break;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Valor inválido.");
                        break;
                    }
                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor a retirar: "));
                    if (valor > 0) {
                        if (valor <= saldo) {
                            saldoActual = saldo - valor;
                            JOptionPane.showMessageDialog(null, "Operación exitosa.\nSaldo actual:\n$"+saldoActual);
                            break;
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Fondos insuficientes");
                            break;
                        }
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Valor inválido.");
                        break;
                    }
                case 4:
                    valor = saldo / 4000;
                    JOptionPane.showMessageDialog(null, "La conversión de tu saldo actual $"+saldo+" de pesos Colombianos, equivale a $"+valor+" USD");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro cajero automático.");
                    break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Opción no válida");
        }
    }
}