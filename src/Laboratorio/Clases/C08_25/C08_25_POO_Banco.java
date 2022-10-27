package Laboratorio.Clases;

public class C08_25_POO_Banco {

	public static void main(String[] args) {
		Caja caja = new Caja();
		Cliente cliente01 = new Cliente(1, "Dihue");
		Cliente cliente02 = new Cliente(2, "Damian");

		System.out.println(cliente01.toString());

		caja.depositar(cliente01,1000);
		caja.extraer(cliente01,50);
		caja.depositar(cliente02,100);

		System.out.println(cliente01.toString());
		System.out.println(cliente02.toString());
	}
}
class Cliente {
	private int numeroCliente;
	private String nombre;
	private int saldo;

	public Cliente(int numeroCliente, String nombre) {
		this.numeroCliente = numeroCliente;
		this.nombre = nombre;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente{" +
			"numeroCliente=" + numeroCliente +
			", nombre='" + nombre + '\'' +
			", saldo=" + saldo +
			'}';
	}
}

class Caja {

	public void depositar(Cliente cliente, int monto) {
		cliente.setSaldo(cliente.getSaldo() + monto);
	}

	public void extraer(Cliente cliente, int monto) {
		cliente.setSaldo(cliente.getSaldo() - monto);
	}
}