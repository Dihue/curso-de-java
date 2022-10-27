package Programacion.Cuatrimestre_02.Clases.C08_25;

public class C03_Auto {

	private int codigoFabricante;
	private String nombre;
	private String marca;
	private int cantidadPuertas;

	// Propiedades (getters y setters)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidadPuertas() {
		return cantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		if (cantidadPuertas < 0) {
			cantidadPuertas = 0;
		} else if (cantidadPuertas > 5) {
			cantidadPuertas = 0;
		}
		this.cantidadPuertas = cantidadPuertas;
	}
}
