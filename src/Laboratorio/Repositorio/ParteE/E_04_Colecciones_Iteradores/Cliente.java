package Laboratorio.Repositorio.ParteE.E_04_Colecciones_Iteradores;

public class Cliente {
	private String nombre;
	private String nroCuenta; // Como no vamos a realizar operaciones, es del tipo texto
	private double saldo;
	private int dni;


	// Constructor
	public Cliente(String nombre, String nroCuenta, double saldo, int dni) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.dni = dni;
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

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre= " + nombre +
			", nroCuenta= " + nroCuenta +
			", saldo= " + saldo +
			", dni= " + dni +']';
	}

	/*
	Método creado con el generador de código, el hashCode nos permitirá determinar si el
	objeto agregado a la colección es igual o repetido. Por ello en este tipo de colecciones
	HashSet no se permitirá elementos duplicados
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int resultado = 1;
		resultado = prime * resultado + dni;
		return resultado;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (dni != other.dni) {
			return false;
		}
		return true;
	}
}
