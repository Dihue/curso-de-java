package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

// Lista Enlazada Circular
public class ListaCircular {
    private int tamanio;
    private Nodo primero;
    public Nodo ultimo;

    public void Lista() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            // Agregamos el primer nodo
            this.primero = nuevo;
            this.ultimo = nuevo;
            // Apunta al primer Nodo
            this.ultimo.siguiente = this.primero;
        } else {
            // Usa los punteros a "primero" y "ultimo"
            this.ultimo.siguiente = nuevo;
            nuevo.siguiente = this.primero;
            ultimo = nuevo;
        }
        this.tamanio++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            // Se tiene que recorrer la lista hasta llegar al último nodo
            Nodo aux = primero;

            while (aux.siguiente != ultimo) {
                aux = aux.siguiente;
            }
            aux = null;
            this.tamanio--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            Nodo aux = this.primero;

            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
