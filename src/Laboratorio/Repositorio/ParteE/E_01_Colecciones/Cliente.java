package Laboratorio.Repositorio.ParteE.E_01_Colecciones;

public class Cliente {
	private String nombre;
	private String nroCuenta; // Como no vamos a realizar operaciones, es del tipo texto
	private double saldo;


	// Constructor
	public Cliente(String nombre, String nroCuenta, double saldo) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [nombre= " + nombre + ", nroCuenta= " + nroCuenta + ", saldo= " + saldo + ']';
	}
}
