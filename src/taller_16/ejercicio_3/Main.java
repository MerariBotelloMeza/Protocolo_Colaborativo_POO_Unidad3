package taller_16.ejercicio_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Ejercicio 2:*/
        System.out.println("\nEjercicio 3:\n");
        System.out.println("Ingrese el mensaje que va a enviar:");
        Scanner sc = new Scanner(System.in);
        String mensaje = sc.nextLine();
        GestorMensajes gestorMensajes = new GestorMensajes();

        Mensajero mensajeEmail = new MensajeEmail();
        Mensajero mensajeSMS = new MensajeSMS();
        Mensajero mensajePush = new MensajePush();

        System.out.println("\nSeleccione una opcion del menu para enviar su mensaje:");
        System.out.println("1. Enviar por email");
        System.out.println("2. Enviar por SMS");
        System.out.println("3. Enviar por push");

        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                gestorMensajes.gestionarMensaje(mensajeEmail, mensaje);
                break;
            case 2:
                gestorMensajes.gestionarMensaje(mensajeSMS, mensaje);
                break;
            case 3:
                gestorMensajes.gestionarMensaje(mensajePush, mensaje);
                break;

        }sc.close();

    }
}
