/*
Bloque: Ciclos o Bucles

Ejercicio 1: 
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo. 
*/

import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        int num, cuadrado;

        System.out.println("Digite el numero que desea sacar el cuadrado: ");
        num = entrada.nextInt();

        while (num >= 0) {
            cuadrado = num*num;
            System.out.println("El cuadrado de "+num+" es "+cuadrado);
            System.out.println("Digite el numero que desea sacar el cuadrado: ");
            num = entrada.nextInt();
        }

    }
}