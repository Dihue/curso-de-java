package Programacion.Cuatrimestre_02.Clases.C09_06;

import Programacion.Cuatrimestre_02.Clases.C09_01.Alumno;

public class Becario extends Alumno {

	public String laboratorio;

	// Sobre-escritura
	// cambio de privado a protegido de la variable de la superclass
	@Override
	public double getCuotaMensual() {
		double cuotaAlumno = super.getCuotaMensual();
		return cuotaAlumno / 2;
	}

	// Sobrecargar (dentro de la misma clase)
	// Firma de metodos distintas:
	// 		distintos tipos de valores, no interesa el nombre del valor

	public void Metodo() {
		System.out.println("Sin contenido");
	}

	public void Metodo(String valor){
		// hace una cosa
		System.out.println("Con string " + valor);
	}

	public void Metodo(int valor){
		// hace otra cosa
		System.out.println("Con int " + valor);
	}

}
