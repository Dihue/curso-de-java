package Laboratorio.Clases.C09_30.PracticaExamen;

public abstract class Persona {
	// Atributos
	private String nombre;
	private String apellido;
	private int dni;
	private double sueldoBase;

	// Constructor
	public Persona(String nombre, String apellido, int dni, double sueldoBase) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoBase = sueldoBase;
	}

	// Métodos
	public void modificarDatos(String nombreNuevo, String apellidoNuevo, int dniNuevo) {
		this.nombre = nombreNuevo;
		this.apellido = apellidoNuevo;
		this.dni = dniNuevo;
	}

	public abstract void subirSueldo(double incremento);

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	@Override
	public String toString() {
		return "Persona{" +
			"nombre='" + nombre + '\'' +
			", apellido='" + apellido + '\'' +
			", dni=" + dni +
			", sueldoBase=" + sueldoBase +
			'}';
	}
}
