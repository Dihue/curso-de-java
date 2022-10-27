package Laboratorio.Clases.C09_30.PracticaExamen;

public class Jefe extends Persona {
	private double porcentaje;

	public Jefe(String nombre, String apellido, int dni, double sueldoBase, double porcentaje) {
		super(nombre, apellido, dni, sueldoBase);
		this.porcentaje = porcentaje;
	}

	public double verSueldo() {
		return (getSueldoBase() + 1000) * (porcentaje/100);
	}

	@Override
	public void subirSueldo(double incremento) {

	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() {
		return "Jefe{" +
			"porcentaje=" + porcentaje +
			'}';
	}
}
