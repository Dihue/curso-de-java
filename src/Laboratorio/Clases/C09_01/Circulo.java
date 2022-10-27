package Laboratorio.Clases.C09_01;

public class Circulo extends Geometria {
	private double radio;

	static double numPi = Math.PI;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public void area() {
		double area = numPi * (getRadio() * getRadio());
		System.out.println("Area del círculo: " + area);
	}
}
