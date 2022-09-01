package Programacion.Cuatrimestre_02.Clases.C09_01;

// Con el abstract solo se usa la clase para hacer de clase base
public abstract class Persona {
	private String apellido;
	private String nombre;
	private String dni;

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	// Método Abstracto
	// las clases que heredan este método deben darle el cuerpo
	public abstract void imprimirNombreCompleto();
}
