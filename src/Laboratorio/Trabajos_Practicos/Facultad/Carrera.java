package Laboratorio.Trabajos_Practicos.Facultad;

import java.util.LinkedList;
import java.util.List;

public class Carrera implements Informacion {
	// Atributos
	private String nombre;
	private List<Materia> coleccionMaterias = new LinkedList<>();

	// Método
	public void agregarMateria(Materia materia) {

	}

	public void eliminarMateria(String nombreMateria) {

	}

	public void encontrarMateria(String nombreMateria) {

	}

	// Método Heredado
	@Override
	public int verCantidad() {
		return 0;
	}

	@Override
	public String listarContenidos() {
		return null;
	}

	// Constructor
	public Carrera(String nombre, List<Materia> coleccionMaterias) {
		this.nombre = nombre;
		this.coleccionMaterias = coleccionMaterias;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Materia> getColeccionMaterias() {
		return coleccionMaterias;
	}

	public void setColeccionMaterias(
		List<Materia> coleccionMaterias) {
		this.coleccionMaterias = coleccionMaterias;
	}

	// Para la muestra de datos
	@Override
	public String toString() {
		return "Carrera{" +
			"nombre='" + nombre + '\'' +
			", coleccionMaterias=" + coleccionMaterias +
			'}';
	}

}