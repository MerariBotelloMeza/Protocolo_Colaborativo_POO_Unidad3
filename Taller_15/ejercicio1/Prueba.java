package Taller_15.ejercicio1;

public class Prueba {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien años de soledad",
                "Gabriel García Márquez");

        GeneradorReporte reporte = new GeneradorReporte();

        PersistenciaLibro persistencia = new PersistenciaLibro();

        // Mostrar información
        libro.mostrarInformacion();

        // Generar reporte
        reporte.generarReporte(libro);

        // Guardar información
        persistencia.guardarLibro(libro);
    }
}
