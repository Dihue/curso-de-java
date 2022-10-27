package Laboratorio.Clases.C09_01;

public class Rectangulo  extends Geometria {

	private int base;
	private int altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public void area() {
		int area = getBase() * getAltura();
		System.out.println("Area del triángulo: " + area);
	}
}
