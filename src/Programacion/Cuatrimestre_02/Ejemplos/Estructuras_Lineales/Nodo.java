package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

// Nodo simple
public class Nodo {
    public String valor;
    public Nodo siguiente;

    // Constructor
    public Nodo(String valor) {
        this.valor = valor;
        // Hacia donde está apuntando
        this.siguiente = null;
    }

    // Devuelve el valor del nodo
    @Override
    public String toString() {
        return this.valor;
    }
}
