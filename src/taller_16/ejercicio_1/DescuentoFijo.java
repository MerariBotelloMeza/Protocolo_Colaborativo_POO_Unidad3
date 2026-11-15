package taller_16.ejercicio_1;

public class DescuentoFijo extends Descuento {

    private double valorDescuento;

    public DescuentoFijo(double valorDescuento) {
        this.valorDescuento = valorDescuento;
    }

    @Override
    public double calcularDescuento(double precio) {
        return Math.min(valorDescuento, precio);

    }

}
