package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

// Nodo Doble Enlazado
public class NodoDoble {
    public String valor;
    public NodoDoble anterior;
    public NodoDoble siguiente;

    // Constructor
    public NodoDoble(String valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
