package Programacion.Cuatrimestre_02.Clases.C09_29;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		p1.nombre = "Juan";

		Persona p2 = new Persona();
		p2.nombre = "Pedro";

		//p2 = p1;
		p2.nombre = p1.nombre;

		p1.nombre = "diego";

		System.out.println(p2.nombre);

		/*Persona p = new Persona();
		p.nombre = "Juan";
		p.productos.nombre = "fanta";
		//producto.nombre = "coca cola";

		Productos producto = new Productos();


		p.productos = producto;
		System.out.println(p.productos.nombre);

		p = null;

		System.out.println("Luego de destruir a Persona" + producto.nombre);

		System.out.println(p.productos.nombre);*/

		/*Persona.apellido = "Gomez";

		Persona p1 = new Persona();
		//p1.nombre = "Juan";

		System.out.println(p1.getNombre());
		System.out.println(p1.getApellidoInstancia());*/
	}

}
