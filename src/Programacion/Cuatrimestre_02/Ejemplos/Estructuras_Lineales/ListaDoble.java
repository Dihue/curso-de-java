package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

// Lista Doblemente Enlazada
public class ListaDoble {
    private NodoDoble primero;
    private NodoDoble ultimo;
    private int tamanio;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    public void agregar(String valor) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            NodoDoble aux = primero;

            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            // Asignar el primero y ultimo
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
            this.ultimo = nuevo;
        }
        this.tamanio++;
    }

    public void agregarInicio(String valor) {
        NodoDoble nuevo = new NodoDoble(valor);

        if (vacia()) {
            this.primero = nuevo;
        } else {
            nuevo.siguiente = this.primero;
            this.primero.anterior = nuevo;
            this.primero = nuevo;
        }
    }

    public void eliminarUltimo() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            NodoDoble aux = primero;
            NodoDoble nodoAnterior = aux;

            while (aux.siguiente != null) {
                nodoAnterior = aux;
                aux = aux.siguiente;
            }

            if (aux == this.primero) {
                this.primero = null;
                this.ultimo = null;
            } else {
                this.ultimo = nodoAnterior;
                nodoAnterior.siguiente = null;
                aux.anterior = null;
            }
            this.tamanio--;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            NodoDoble aux = primero;

            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }

    public void imprimirInverso() {
        if (vacia()) {
            System.out.println("Lista vacía");
        } else {
            NodoDoble aux = ultimo;

            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.valor);
                aux = aux.anterior;
            }
        }
    }
}
