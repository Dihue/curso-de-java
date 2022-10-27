package Laboratorio.Clases.C09_08;

public abstract class Vehiculo {
	private String marca;
	private int rueda;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRueda() {
		return rueda;
	}

	public void setRueda(int rueda) {
		this.rueda = rueda;
	}

	public Vehiculo(String marca, int rueda) {
		this.marca = marca;
		this.rueda = rueda;
	}

	@Override
	public String toString() {
		return "Vehiculo{" +
			"marca='" + marca + '\'' +
			", rueda=" + rueda +
			'}';
	}
}
