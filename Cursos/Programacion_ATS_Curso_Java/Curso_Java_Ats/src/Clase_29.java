import java.util.Scanner;

public class Clase_29 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println();

        int contador;

        System.out.println("Digite la cantidad de numeros que desea: ");
        contador = entrada.nextInt();

        for (int i = 1; i <= contador; i++) {
            System.out.println(i);
        }

    }
}
