package taller_17.ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(String numero, String tipo, double balance) {
        super(numero, tipo, balance);
    }

    @Override
    public void mostrarCuenta(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Balance: $" + this.balance);
    }

}
