package Laboratorio.Trabajos_Practicos.Facultad;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Materia implements Informacion {
	// Atributos
	private String nombre;
	private Profesor titular;
	private Set<Estudiante> coleccionEstudiantes = new TreeSet<>();

	// Método
	public void agregarEstudiante(Estudiante estudiante) {
		coleccionEstudiantes.add(estudiante);
	}

	public void eliminarEstudiante(String nombreEstudiante) {
		Iterator<Estudiante> iteratorEstudiante = coleccionEstudiantes.iterator();
		while (iteratorEstudiante.hasNext()) {
			String estudianteEliminar = iteratorEstudiante.next().getNombre();
			if (estudianteEliminar.equals(nombreEstudiante)) {
				iteratorEstudiante.remove();
			}
		}
	}

	public void modificarTitular(Profesor profesor) {
		setTitular(profesor);
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
	public Materia(String nombre, Profesor titular, Set<Estudiante> coleccionEstudiantes) {
		this.nombre = nombre;
		this.titular = titular;
		this.coleccionEstudiantes = coleccionEstudiantes;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getTitular() {
		return titular;
	}

	public void setTitular(Profesor titular) {
		this.titular = titular;
	}

	public Set<Estudiante> getColeccionEstudiantes() {
		return coleccionEstudiantes;
	}

	public void setColeccionEstudiantes(
		Set<Estudiante> coleccionEstudiantes) {
		this.coleccionEstudiantes = coleccionEstudiantes;
	}

	// Para la muestra de datos
	@Override
	public String toString() {
		return "Materia{" +
			"nombre='" + nombre + '\'' +
			", titular=" + titular +
			", coleccionEstudiantes=" + coleccionEstudiantes +
			'}';
	}

}