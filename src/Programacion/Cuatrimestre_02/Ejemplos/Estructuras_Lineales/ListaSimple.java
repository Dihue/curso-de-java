package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

// Lista Simplemente Enlazada
public class ListaSimple {
    private Nodo primero;
    public int tamanio;

    public ListaSimple() {
        this.primero = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = nuevo;
        } else {
            Nodo aux = this.primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
        this.tamanio++;
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            Nodo aux = primero;
            Nodo nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }
            /*
            Verifico si realmente avanzó en la lista hasta llegar al último nodo
            que sea distinto del primero.
            Si estoy en el primero, entonces lo hago null para indicar que la lista
            está vacía.
             */
            if (aux == this.primero) {
                this.primero = null;
            } else {
                // Se le indica al nodo anterior que no apunte más al nodo a eliminar "aux"
                nodoAnterior.siguiente = null;
            }
            // Decremento del tamaño
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
