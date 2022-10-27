package Laboratorio.Trabajos_Practicos.Facultad;

public class Profesor extends Persona {
	// Atributos
	private double basico;
	private int antiguedad;

	// Método
	public double calcularSueldo() {
		return 0;
	}

	// Método Heredado
	@Override
	public void modificarDatos() {

	}

	// Constructor
	public Profesor(String nombre, String apellido, int legajo, double basico, int antiguedad) {
		super(nombre, apellido, legajo);
		this.basico = basico;
		this.antiguedad = antiguedad;
	}

	// Getters y Setters
	public double getBasico() {
		return basico;
	}

	public void setBasico(double basico) {
		this.basico = basico;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	// Para la muestra de datos
	@Override
	public String toString() {
		return "Profesor{" +
			"basico=" + basico +
			", antiguedad=" + antiguedad +
			", nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", legajo=" + legajo +
			'}';
	}

}
