package Programacion.Cuatrimestre_02.Clases.C09_06;

import Programacion.Cuatrimestre_02.Clases.C09_01.Alumno;

public class Main {

	public static void main(String[] args) {

		Alumno a1 = new Alumno();
		a1.setApellido("Perez");
		a1.setNombre("Carlos");
		a1.setCuotaMensual(1000);
		//System.out.println("Cuota alumno: " + a1.getCuotaMensual());
		System.out.println("Alumno: " + a1.toString());


		Becario b1 = new Becario();
		b1.setApellido("Garcia");
		b1.setNombre("Juan");
		System.out.println("Becario: " + b1.toString());

		//b1.Metodo();
		//b1.Metodo("hola");
		//b1.Metodo(2);

		// Con herencia
		b1.setCuotaMensual(1000);
		double cuota = b1.getCuotaMensual();
		//System.out.println(cuota);
	}

}
