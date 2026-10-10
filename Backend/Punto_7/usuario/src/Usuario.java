public class Usuario {

    private String username;
    private String email;
    private String rol;

    // Constructor 1: recibe únicamente el nombre
    public Usuario(String username) {
        this.username = username;
        this.email = "Desconocido";
        this.rol = "Invitado";
    }

    // Constructor 2: recibe todos los datos
    public Usuario(String username, String email, String rol) {
        this.username = username;
        this.email = email;
        this.rol = rol;
    }

    public void mostrar() {
        System.out.println("Usuario: " + username);
        System.out.println("Email: " + email);
        System.out.println("Rol: " + rol);
        System.out.println("--------------------");
    }
}