package Programacion.Cuatrimestre_02.Clases.C09_13;

public class DocenteI extends PersonaI implements IEntidad{

	public String titulo;

	@Override
	public String getNombreCompleto() {
		return titulo + " " + nombre + " " + apellido ;
	}

}
