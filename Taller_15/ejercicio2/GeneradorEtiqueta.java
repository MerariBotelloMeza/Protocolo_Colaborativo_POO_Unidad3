package Taller_15.ejercicio2;

public class GeneradorEtiqueta {
    public void generarEtiqueta(Producto producto) {

        System.out.println("\n Etiqueta del producto");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
    }
}
