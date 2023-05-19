package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_NoLineales.Arboles;

// Nodo para TAD Cola para Recorrido en Anchura de un Árbol Binario
public class NodoColaRecorridoAnchura {
    // Definir un atributo para apuntar recursivamente a otro nodo de la cola
    public NodoColaRecorridoAnchura siguiente;

    // Definir un atributo para almacenar un valor del tipo Nodo Árbol Binario
    public NodoABinario valor;

    public NodoColaRecorridoAnchura(NodoABinario valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
