package taller_16.ejercicio_1;

public class AplicarDescuento {

    public double aplicarDescuento(Descuento descuento, double precio) {/*El metodo recibe cualquier objeto que herede de Descuento*/
        double valorDescuento = descuento.calcularDescuento(precio);
        return precio - valorDescuento;

    }

}
