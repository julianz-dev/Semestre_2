//*Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7. */

public class Ejercicio_9 {
    public static void main(String[] args) {
        
        int contador = 100;

        while (contador >= 0) {
            System.out.println(contador);
            contador -=7;
        }
    }
}