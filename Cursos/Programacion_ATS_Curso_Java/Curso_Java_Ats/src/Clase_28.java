import java.util.Scanner;

public class Clase_28 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de veces que desea un numero: ");
        int num = 1, contador;

        contador = entrada.nextInt();

        do {
            System.out.println(num);
            num++;

        } while (num <= contador);

    }
}
