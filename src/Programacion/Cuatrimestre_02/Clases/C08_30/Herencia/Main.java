package Programacion.Cuatrimestre_02.Clases.C08_30.Herencia;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona();

		p1.mostrar();

		Empleado e1 = new Empleado();

		e1.mostrar();

		Cliente c1 = new Cliente();

		c1.mostrar();

		Directivo d1 = new Directivo();

		d1.mostrar();
		d1.CalcularSueldo();
	}

}
