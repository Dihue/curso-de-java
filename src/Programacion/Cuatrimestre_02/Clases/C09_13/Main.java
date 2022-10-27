package Programacion.Cuatrimestre_02.Clases.C09_13;

public class Main {

	public static void main(String[] args) {

		AlumnoI a1 = new AlumnoI();
		a1.getNombreCompleto();


		DocenteI d1 = new DocenteI();
		d1.getNombreCompleto();

		printlEntidad(a1);
		printlEntidad(d1);

		printDireccion(a1);
		//printDireccion(d1);

		Auto au1 = new Auto();

		printlEntidad(au1);

	}

	public static void printlEntidad(IEntidad entidad) {
		System.out.println(entidad.getNombreCompleto());
	}

	public static void printDireccion(IDireccion entidad) {
		System.out.println(entidad.getDireccionCompleta());
	}

}
