package Laboratorio.Clases.Segundo_Parcial;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona implements Informe {
    private List<Activo> listaActivos;

    public Cliente(int dni, String apellido, String nombre, String direccion) {
        super(nombre, apellido, dni, direccion);
        this.listaActivos = new ArrayList<>();
    }

    public List<Activo> getListaActivos() {
        return listaActivos;
    }

    public void setListaActivos(List<Activo> listaActivos) {
        this.listaActivos = listaActivos;
    }

    @Override
    public String toString() {
        return "\n" + "DNI: " + getDni() + " - " +
                getApellido() + ", " + getNombre() +
                " - Dirección: " + getDireccion();
    }

    @Override
    public String imprimir() {
        String dato = "\n" + "DNI: " + getDni() + " - " +
                getApellido() + ", " + getNombre() +
                " - Dirección: " + getDireccion() +
                " - Activos: " + getListaActivos();
        return dato;
    }
}
