package Laboratorio.Clases.C09_30.PracticaExamen;

public class Empleado extends Persona{

	public Empleado(String nombre, String apellido, int dni, double sueldoBase) {
		super(nombre, apellido, dni, sueldoBase);
	}

	public double verSueldo() {
		return getSueldoBase() + 1000;
	}

	@Override
	public void subirSueldo(double incremento) {

	}
}
