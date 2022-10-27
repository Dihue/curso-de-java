package Laboratorio.Clases.C09_08;

public class Bicicleta extends Vehiculo implements Conductor, Estructura, Proteccion {

	private int rodado;

	public int getRodado() {
		return rodado;
	}

	public void setRodado(int rodado) {
		this.rodado = rodado;
	}

	public Bicicleta(String marca, int rueda, int rodado) {
		super(marca, rueda);
		this.rodado = rodado;
	}

	public Bicicleta(String marca, int rueda) {
		super(marca, rueda);
	}

	@Override
	public String toString() {
		return "Bicicleta{" +
			"rodado=" + rodado +
			'}';
	}

	@Override
	public void marchar(Integer velocidad) {
		System.out.println("Velocidad de la marcha: " + velocidad + " km");

	}

	@Override
	public boolean frenos() {
		return false;
	}

	@Override
	public boolean seguro() {
		return false;
	}
}
