package Programacion.Cuatrimestre_02.Clases.C09_20;

public class Main {

	public static void imprimir(IEntidad entidad) {
		System.out.println(entidad.getNombre());
	}

	public static void main(String[] args) {

		Vehiculo v1 = new Vehiculo();
		Auto4Puertas a4 = new Auto4Puertas();
		Barco b1 = new Barco();

		Vehiculo[] listeVehiculos = new Vehiculo[100];


		Auto4Puertas a1 = new Auto4Puertas();
		a1.precio = 10000;

		imprimir(a1);

		listeVehiculos[0] = a1;

		Bicicleta bici1 = new Bicicleta();
		bici1.precio = 200;

		listeVehiculos[1] = a1;

		Barco barco1 = new Barco();
		barco1.precio = 15000;

		listeVehiculos[2] = barco1;

		Auto4Puertas autoTemp = (Auto4Puertas) listeVehiculos[0];
		autoTemp.color = "rojo";


		double suma = 0;
		int i = 0;

		while (i < 100 && listeVehiculos[i] != null) {
			suma = suma + listeVehiculos[i].precio;
			i++;
		}


		/*for (int i = 0; i < 100; i++) {
			if (listeVehiculos[i] != null) {
				suma = suma + listeVehiculos[i].precio;
			}
		}*/

		System.out.println(suma);

		/*v1 = a4;
		v1 = b1;

		a4 = (Auto4Puertas) v1;
		b1 = (Barco) v1;

		// el complilador no puede darse cuenta del problema, ya que esta bien hecho el casting explicito
		a4 = (Auto4Puertas) v1;*/



		// Tipos de Datos por Referencia
		Persona p1 = new Persona();
		Empleado e1 = new Empleado();

		/*
		Antes de hacer herencia entre las clases
		Casting Implícito
		e1 = p1;

		Casting Explicito
		e1 = (Persona) p1;
		*/

		// Casting Implícito
		p1 = e1;

		// Casting Explicito
		e1 = (Empleado) p1;





		//int i = 0;
		double d;

		// Casting implicito
		i = 5;
		d = i;
		//System.out.println(d);

		d = 5.5;
		// Casting explicito
		i = (int) d;

		//System.out.println(i);

		// No se puede realizar el casting
		int i2 = 2;
		boolean b;

		//b = (boolean) i2;
	}

}
