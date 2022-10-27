package Laboratorio.Repositorio.ParteB.ParteB_01_POO;

import java.util.Arrays;

public class EJ01_Vehiculo {

	public static void main(String[] args) {
		// Instanciar un objeto
		Vehiculo auto = new Vehiculo("rojo", 4, 9, 2, 70);
		System.out.println(auto.getColor());

		// Clase con herencia
		Moto zanella = new Moto("negro", 2, 1, 2, 50);
		System.out.println(zanella.toString());

		// Colección de Objetos
		Vehiculo estacionamiento[] = {
			new Vehiculo("rojo", 4, 2, 3, 1000),
			new Vehiculo("azul", 4, 2, 3, 1200),
			new Vehiculo("verde", 6, 2, 4, 2000)
		};

		// Recorrido de una colección de objetos y listarlos
		for (Vehiculo vehiculo: estacionamiento) {
			System.out.println(vehiculo.toString());
		}

		// Una clase que contiene clases
		Concesionaria concesionaria = new Concesionaria(estacionamiento);

		System.out.println("Lista de Autos");
		System.out.println(concesionaria.toString());
	}

}

class Vehiculo {
	/*
	El modificador private evita el acceso al atributo(variable), desde
	fuera de la clase, por lo que se dice que está ENCAPSULADO
	 */
	private String color;
	private int cantRuedas;
	private double ancho, largo, peso;

	// Constructor por defecto
	public Vehiculo() {
		// this.etc se refiere al atributo de la clase
		this.color = "Sin color";
		this.cantRuedas = 4;
		this.ancho = 1.65;
		this.largo = 2.78;
		this.peso = 695;
	}

	// Constructor con todos los parámetros
	public Vehiculo(String color, int cantRuedas, double ancho, double largo, double peso) {
		this.color = color;
		this.cantRuedas = cantRuedas;
		this.ancho = ancho;
		this.largo = largo;
		this.peso = peso;
	}

	// Get del Atributo color
	public String getColor() {
		// return es cuando retorna un valor
		return color;
	}

	// Set del Atributo color
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	/*
	Todas las clases tiene el método toString() porque lo heredan de la clase
	Object, por lo que al hacer esto, lo estamos SOBREESCRIBIENDO, que significa
	que el objeto base de esta clase también tiene definido este método.
	 */
	public String toString() {
		return "Vehiculo{" +
			"color='" + color + '\'' +
			", cantRuedas=" + cantRuedas +
			", ancho=" + ancho +
			", largo=" + largo +
			", peso=" + peso +
			'}';
	}
}

// Palabra reservada extends indica la HERENCIA
class Moto extends Vehiculo {

	// Constructor con los mismos parámetros de la clase padre
	public Moto(String color, int cantRuedas, double ancho, double largo, double peso) {
		super(color, 2, ancho, largo, peso);
	}
}

class Concesionaria {
	// Asociación por Agregación
	private Vehiculo coleccionDeVehiculos[];

	public Concesionaria(Vehiculo[] coleccionDeVehiculos) {
		this.coleccionDeVehiculos = coleccionDeVehiculos;
	}

	@Override
	public String toString() {
		return "Concesionaria{" +
			"Colección de Vehículos=" + Arrays.toString(coleccionDeVehiculos) +
			'}';
	}
}