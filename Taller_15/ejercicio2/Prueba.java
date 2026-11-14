package Taller_15.ejercicio2;

public class Prueba {
    public static void main(String[] args) {

        Producto producto = new Producto("Telefono", 50000, 10);

        GeneradorEtiqueta etiqueta = new GeneradorEtiqueta();

        CalculadoraPrecio calculadora = new CalculadoraPrecio();

        producto.mostrarProducto();

        etiqueta.generarEtiqueta(producto);

        double precioFinal = calculadora.calcularPrecio(producto);

        System.out.println("Precio con IVA: $" + precioFinal);
    }
}
