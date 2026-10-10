public class Main {

    public static void main(String[] args) {

        // 1. Crear usuario con valores predeterminados
        Usuario usuario = new Usuario("jhon");

        // 2. Crear usuario con todos los datos
        Usuario usuario2 = new Usuario(
                "ana",
                "ana@mail.com",
                "Administrador");

        // 3. Mostrar la información
        usuario.mostrar();
        usuario2.mostrar();
    }
}
