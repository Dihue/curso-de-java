package Laboratorio.Clases.C09_22;

public class Espectador extends Persona implements Informaciones {
	private char fila;
	private int silla;

	public Espectador(String nombre, int dni, char fila, int silla) {
		super(nombre, dni);
		this.fila = fila;
		this.silla = silla;
	}

	public char getFila() {
		return fila;
	}

	public void setFila(char fila) {
		this.fila = fila;
	}

	public int getSilla() {
		return silla;
	}

	public void setSilla(int silla) {
		this.silla = silla;
	}

	@Override
	public String toString() {
		return "Espectador{" +
			"fila=" + fila +
			", silla=" + silla +
			", nombre='" + nombre + '\'' +
			", dni=" + dni +
			'}';
	}

	@Override
	public String datosClase() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}
}
