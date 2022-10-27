package Programacion.Cuatrimestre_02.Clases.C09_13;

public class AlumnoI extends PersonaI implements IEntidad, IDireccion {


	@Override
	public String getNombreCompleto() {
		return apellido + ", " + nombre;
	}

	@Override
	public String getDireccionCompleta() {
		return null;
	}
}
