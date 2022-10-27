package Programacion.Cuatrimestre_02.Clases.C09_01;

public class Alumno extends Persona {

	protected double cuotaMensual;

	public double getCuotaMensual() {
		return cuotaMensual;
	}

	public void setCuotaMensual(double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
	}

	@Override
	public void imprimirNombreCompleto() {
		System.out.println(getApellido() + getNombre() + getCuotaMensual());
	}
}
