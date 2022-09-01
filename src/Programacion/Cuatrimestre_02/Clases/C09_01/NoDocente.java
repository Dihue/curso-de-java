package Programacion.Cuatrimestre_02.Clases.C09_01;

public class NoDocente extends Persona {

	private double sueldo;


	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public void imprimirNombreCompleto() {
		System.out.println(getApellido() + getSueldo());
	}
}
