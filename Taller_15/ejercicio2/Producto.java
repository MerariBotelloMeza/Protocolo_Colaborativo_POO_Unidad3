package Taller_15.ejercicio2;

public class Producto {

        String nombre;
        double precio;
        int stock;

        public Producto(String nombre, double precio, int stock) {
            this.nombre = nombre;
            this.precio = precio;
            this.stock = stock;
        }

        public String getNombre() {
        return nombre;
        }

        public double getPrecio() {
        return precio;
        }

        public int getstock() {
        return stock;
        }


    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + stock);
    }
}
