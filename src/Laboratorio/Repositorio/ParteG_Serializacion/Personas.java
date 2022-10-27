package Laboratorio.Repositorio.ParteG_Serializacion;

import java.io.Serializable;

// Debemos implementar la interfaz serializable
public class Personas implements Serializable {
	private String nombre;
	private int dni;

	public Personas(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	@Override
	public String toString() {
		return nombre +	" (" + dni + ") ";
	}
}
