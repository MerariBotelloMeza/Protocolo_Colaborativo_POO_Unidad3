package Talle_14.ejercicio2;

public class Prueba_ejer1 {
    public static void main(String[] args){

        Persona[] persona1 = {
                new Persona(),
                new Estudiante(),
                new Profesora()
        };

        for (Persona persona : persona1){
            persona.presentarse();
        }
    }
}
