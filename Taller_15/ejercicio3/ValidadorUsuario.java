package Taller_15.ejercicio3;

public class ValidadorUsuario {
    public boolean validarDatos(Usuario usuario) {

        return !usuario.getNombre().isEmpty()
                && usuario.getCorreo().contains("@")
                && usuario.getContrasena().length() >= 8;
    }
}
