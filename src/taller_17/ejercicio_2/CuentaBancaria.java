package taller_17.ejercicio_2;

public class CuentaBancaria {
    protected String numero;
    protected String tipo;
    protected double balance;

    public CuentaBancaria(String numero, String tipo, double balance) {
        this.numero = numero;
        this.tipo = tipo;
        this.balance = balance;
    }

    public void mostrarCuenta(){
        System.out.println("Numero: " + this.numero);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Balance: $" + this.balance);
    }
}
