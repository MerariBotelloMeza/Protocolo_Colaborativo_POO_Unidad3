package Taller_15.ejercicio3;

public class ServicioAutenticacion {
    public boolean autenticar(Usuario usuario, String contrasena) {

        return usuario.getContrasena().equals(contrasena);
    }
}
