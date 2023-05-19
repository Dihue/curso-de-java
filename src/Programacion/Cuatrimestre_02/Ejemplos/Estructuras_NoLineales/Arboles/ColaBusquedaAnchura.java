package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_NoLineales.Arboles;

// TAD Cola para el Recorrido en Anchura para un Árbol Binario
public class ColaBusquedaAnchura {
    private NodoColaRecorridoAnchura primero;
    private NodoColaRecorridoAnchura ultimo;
    private int tamanio;

    public ColaBusquedaAnchura() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // Enqueue
    public void encolar(NodoABinario valor) {
        NodoColaRecorridoAnchura nuevo = new NodoColaRecorridoAnchura(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        }
        this.tamanio++;
    }

    // Dequeue
    public NodoABinario desencolar() {
        if (vacia()) {
            return null;
        }
        else {
            NodoABinario aux = this.primero.valor;

            this.primero = this.primero.siguiente;
            this.tamanio--;

            return aux;
        }
    }

}
