//*Diseñar un programa que muestre el producto de los 10 primeros números impares. */

public class Ejercicio_11 {
    public static void main(String[] args) {

        int numero = 1;
        int contador = 0;
        int producto = 1;

        while (contador < 10) {
            producto = producto * numero;
            System.out.println("Producto de " + numero + ": " + producto);
            numero += 2;
            contador++;
        }
    }
}