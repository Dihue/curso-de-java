package Laboratorio.Clases.C09_01;

public abstract class Geometria {

	public abstract void area();
}

class Main {

	public static void main(String[] args) {
		Rectangulo rect1 = new Rectangulo();
		rect1.setAltura(2);
		rect1.setBase(3);

		Circulo circ1 = new Circulo();
		circ1.setRadio(2);

		rect1.area();
		circ1.area();

		Geometria algo = new Rectangulo();
		algo.area();

	}

}
