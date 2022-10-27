package Programacion.Cuatrimestre_02.Clases.C09_22;

public class Main {

	public static void main(String[] args) {

		Formulario formulario = new Formulario();

		// La interface puede cambiar las instancias de donde se crea (SQL / Oracle)
		IBaseDatos baseDatos = new SQLserver();
		baseDatos.Insertar();


		IBaseDatos baseDatos2 = new Oracle();
		baseDatos2.Insertar();
	}

}
