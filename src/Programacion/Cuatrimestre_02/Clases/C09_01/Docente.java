package Programacion.Cuatrimestre_02.Clases.C09_01;

public class Docente extends Persona {

	private double sueldo;
	private String tituloUniversitario;

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getTituloUniversitario() {
		return tituloUniversitario;
	}

	public void setTituloUniversitario(String tituloUniversitario) {
		this.tituloUniversitario = tituloUniversitario;
	}

	@Override
	public void imprimirNombreCompleto() {
		System.out.println(getApellido() + getTituloUniversitario());
	}
}
