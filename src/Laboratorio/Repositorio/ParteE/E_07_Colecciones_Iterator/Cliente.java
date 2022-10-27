package Laboratorio.Repositorio.ParteE.E_07_Colecciones_Iterator;

import java.util.Objects;

public class Cliente {
	private String nombre;
	private int nroCuenta;
	private double saldo;

	public Cliente(String nombre, int nroCuenta, double saldo) {
		super();
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(int nroCuenta) {
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
		return "Cliente [" + " nombre= " + nombre +
			", nroCuenta= " + nroCuenta + ", saldo= " + saldo + " ]";
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
		if (nroCuenta != other.nroCuenta) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + nroCuenta;
		return result;
	}
}
