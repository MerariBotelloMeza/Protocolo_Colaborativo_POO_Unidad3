package Taller_15.ejercicio3;

public class Prueba {
    public static void main(String[] args) {

        Usuario usuario = new Usuario(
                "luisa",
                "luisa@gmail.com",
                "12345678"
        );

        ServicioAutenticacion autenticacion = new ServicioAutenticacion();

        ValidadorUsuario validador = new ValidadorUsuario();

        // Mostrar datos
        usuario.mostrarDatos();

        // Validar información
        if (validador.validarDatos(usuario)) {
            System.out.println("Los datos del usuario son válidos.");
        } else {
            System.out.println("Los datos del usuario no son válidos.");
        }

        // Autenticar usuario
        if (autenticacion.autenticar(usuario, "12345678")) {
            System.out.println("Autenticación exitosa.");
        } else {
            System.out.println("Error de autenticación.");
        }
    }
}

