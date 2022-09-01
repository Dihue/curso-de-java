package Laboratorio.Trabajos_Practicos;
/*
Crea una clase capaz de crear cuentas corrientes bancarias con las siguientes
características:

	Nombre de clase: CuentaCorriente
	Propiedades:
		saldo(double)
		nombreTitular(String)
		numeroCuenta(long)

	Constructor con dos parámetros:
		nombreTitular(String)
		saldo(double)
Este constructor se encargará de establecer un nombre del titular para la cuenta
corriente, un saldo inicial y asignará un número a la cuenta corriente de tipo
long de forma aleatoria.

	Métodos:
		2 setter: permitirán hacer ingresos y reintegros en un objeto del tipo
			CuentaCorriente.
		2 getter: permitirán obtener saldo de la cuenta y datos generales de una
			CuentaCorriente.
		1 método adicional: permitirá realizar transferencias de dinero de una
			cuenta a otra.

En la clase principal hacer lo siguiente:
	Crea una clase principal con el nombre de UsoCuenta.
	Crear dos instancias de CuentaCorriente con el nombre de Cuenta1 y Cuenta2.
	Haz una transferencia de Cuenta1 a Cuenta2 por importe de $2500.
	Imprime los datos de las dos cuentas en consola.
*/

class UsoCuenta {

	public static void main(String[] args) {
		CuentaCorriente Cuenta1 = new CuentaCorriente("Homero",10000);
		CuentaCorriente Cuenta2 = new CuentaCorriente("Marge",10000);

		System.out.println(Cuenta1.toString());
		System.out.println(Cuenta2.toString());
		System.out.println("\nTransferencia de $2500");
		Cuenta1.transferencia(2500,Cuenta1,Cuenta2);
		System.out.println(Cuenta1.toString());
		System.out.println(Cuenta2.toString());
	}

}
class CuentaCorriente {
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;

	public CuentaCorriente(String nombreTitular, double saldo) {
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
		this.numeroCuenta = (long) (Math.random() * 1000000000 + 1);
	}

	@Override
	public String toString() {
		return "\nCuenta corriente número: " + numeroCuenta +
			"\nTitular: " + nombreTitular +
			"\nSaldo: $ " + saldo;
	}

	public void setIngreso(double ingreso) {
		this.saldo += ingreso;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void transferencia(double monto,
		CuentaCorriente cuentaLlegada, CuentaCorriente cuentaSalida) {

		if (cuentaSalida.getSaldo() > monto) {
			cuentaSalida.setSaldo(cuentaSalida.getSaldo() - monto);
			cuentaLlegada.setIngreso(monto);

		} else {
			System.out.println("Saldo insuficiente");
		}

	}

}
