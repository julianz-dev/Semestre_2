import javax.swing.JOptionPane;

public class Ejercicio_2 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un numero positivo o negativo: "));

        while (numero != 0) {
            if (numero < 0) {
                JOptionPane.showMessageDialog(null, "El numero es negativo");
            } else {
                JOptionPane.showMessageDialog(null, "El numero es positivo");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor digite un numero positivo o negativo: "));
        }
    }
}