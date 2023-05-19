package Laboratorio.Clases.C11_10.PracticaExamen;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Informe, Serializable {
    // Colección de activos
    private ArrayList<Activo> activos;

    // Constructor
    public Cliente(String nombre, String apellido, String direccion, int dni) {
        super(nombre, apellido, direccion, dni);
        this.activos = new ArrayList<>();
    }

    // Agregar un activo
    public void agregarActivo(Activo activo) {
        this.activos.add(activo);
    }

    // Buscar un activo por su nombre
    public Activo buscarActivo(String nombre) {
        for (Activo activo: activos) {
            if (activo.getNombre().equalsIgnoreCase(nombre)) {
                return activo;
            }
        }
        return null;
    }

    @Override
    public String imprimirInformacion() {
        return "Cliente { " +
                "Nombre: " + super.getNombre() +
                ", Apellido: " + super.getApellido() +
                ", Dirección: " + super.getDireccion() +
                ", DNI: " + super.getDni() + '}';
    }

    @Override
    public String toString() {
        return "Cliente { " +
                "Nombre: " + super.getNombre() +
                ", Apellido: " + super.getApellido() +
                ", Dirección: " + super.getDireccion() +
                ", DNI: " + super.getDni() +
                ", Activos: " + this.activos + '}';
    }
}
