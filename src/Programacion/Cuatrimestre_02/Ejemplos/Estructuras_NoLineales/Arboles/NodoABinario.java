package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_NoLineales.Arboles;

// Nodo Arbol Binario
public class NodoABinario {
    public String valor;
    public NodoABinario izquierda;
    public NodoABinario derecha;

    public NodoABinario(String valor) {
        this.valor = valor;
        this.izquierda = null;
        this.derecha = null;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
