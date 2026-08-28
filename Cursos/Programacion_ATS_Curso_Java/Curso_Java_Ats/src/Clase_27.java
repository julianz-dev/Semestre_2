
//*Ciclos */

import java.util.Scanner;

public class Clase_27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        int i=1;

        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println();

        int a=10;

        while (a >= 1) {
            System.out.println(a);
            a--;
        }

        System.out.println();

        int repeat;
        int b=1;

        System.out.println("Digite cuantos números quiere en pantalla: ");
        repeat = entrada.nextInt();

        while (b <= repeat) {
            System.out.println(b);
            b++;
        }        
    }
}
