package Taller_15.ejercicio1;

public class Libro {

        String titulo;
        String autor;

        public Libro(String titulo, String autor ) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public void mostrarInformacion() {
            System.out.println("Titulo: " + titulo);
            System.out.println("Autor: " + autor);
        }

}
