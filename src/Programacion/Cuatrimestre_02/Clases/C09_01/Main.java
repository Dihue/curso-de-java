package Programacion.Cuatrimestre_02.Clases.C09_01;

public class Main{

	public static void main(String[] args) {

		Alumno al1 = new Alumno();
		al1.setNombre("Dihué");
		al1.setApellido("De Cuadra");
		al1.setDni("12312312");
		al1.setCuotaMensual(3000.99);
		al1.imprimirNombreCompleto();

		Docente do1 = new Docente();
		do1.setNombre("Facundo");
		do1.setApellido("Matoff");
		do1.setDni("11122233");
		do1.setSueldo(65000.99);
		do1.setTituloUniversitario("Ingeniero");
		do1.imprimirNombreCompleto();

		NoDocente noD1 = new NoDocente();
		noD1.setNombre("Magalí");
		noD1.setApellido("Perez");
		noD1.setDni("14231423");
		noD1.setSueldo(45000.99);
		noD1.imprimirNombreCompleto();

	}

}
