package taller_16.ejercicio_3;

public class MensajePush extends Mensajero {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("El mensaje: ´´"+mensaje+"´´ ha sido enviado via push.");
    }
}
