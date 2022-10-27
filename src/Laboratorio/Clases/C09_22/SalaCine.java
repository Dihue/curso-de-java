package Laboratorio.Clases.C09_22;

import java.util.List;

public class SalaCine implements Informaciones {
	private int capacidad;
	private String nombre;
	private String pelicula;
	private List<Espectador> listaEspectadores;

	public SalaCine(int capacidad, String nombre, String pelicula) {
		this.capacidad = capacidad;
		this.nombre = nombre;
		this.pelicula = pelicula;
	}

	public SalaCine(int capacidad, String nombre, String pelicula, List<Espectador> listaEspectadores) {
		this.capacidad = capacidad;
		this.nombre = nombre;
		this.pelicula = pelicula;
		this.listaEspectadores = listaEspectadores;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	@Override
	public String toString() {
		return "SalaCine{" +
			"capacidad=" + capacidad +
			", nombre='" + nombre + '\'' +
			", pelicula='" + pelicula + '\'' +
			'}';
	}

	@Override
	public String datosClase() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}
}
