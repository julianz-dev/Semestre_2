import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1. Crear la lista de instrumentos
        List<Instrumento> lista = new ArrayList<>();

        // 2. Agregar los instrumentos
        lista.add(new Guitarra());
        lista.add(new Piano());

        // 3. Recorrer la lista y tocar cada instrumento
        for (Instrumento ins : lista) {
            ins.tocar();
        }
    }
}
