package Laboratorio.Repositorio.ParteE.E_02_Colecciones_Equals;

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

	@Override
	public boolean equals(Object obj) {
		// Casting del objeto obj para que se nos permita la comparación del segundo if anidado
		Cliente other = (Cliente) obj;

		/*
		instanceof nos permite determinar si el objeto obj que recibe esta función como
		parámetro es del tipo Cliente, para que no se tome otro tipo de objeto
		 */
		if (obj instanceof Cliente) {
			if (this.dni == other.dni) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}
