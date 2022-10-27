package Laboratorio.Trabajos_Practicos.Facultad;

public class Estudiante extends Persona {

	// Método heredado
	@Override
	public void modificarDatos() {

	}

	// Constructor
	public Estudiante(String nombre, String apellido, int legajo) {
		super(nombre, apellido, legajo);
	}

	// Para la muestra de datos
	@Override
	public String toString() {
		return "Estudiante{" +
			"nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", legajo=" + legajo +
			'}';
	}

}
