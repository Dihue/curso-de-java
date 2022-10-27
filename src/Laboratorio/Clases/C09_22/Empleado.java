package Laboratorio.Clases.C09_22;

public class Empleado extends Persona implements Informaciones {
	private double sueldo;

	public Empleado(String nombre, int dni, double sueldo) {
		super(nombre, dni);
		this.sueldo = sueldo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado{" +
			"sueldo=" + sueldo +
			", nombre='" + nombre + '\'' +
			", dni=" + dni +
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
