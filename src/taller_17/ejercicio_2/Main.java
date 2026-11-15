package taller_17.ejercicio_2;

public class Main {
    public static void main(String[] args) {
        /*Ejercicio 2:*/
        System.out.println("\nEjercicio 2:\n");
        CuentaBancaria cuentaBancaria = new CuentaBancaria("123456","Corriente",125456);
        CuentaBancaria cuentaAhorros = new CuentaAhorros("23468", "Ahorros",1258744);

        cuentaBancaria.mostrarCuenta();
        cuentaAhorros.mostrarCuenta();

    }

}
