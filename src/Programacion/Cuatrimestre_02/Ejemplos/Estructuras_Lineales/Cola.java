package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

public class Cola {
    private Nodo primero;
    private Nodo ultimo;
    private int tamanio;

    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean vacia() {
        return this.primero == null;
    }

    // ENQUEUE
    public void encolar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacia()) {
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.siguiente = nuevo;
            this.ultimo = nuevo;
        }
        this.tamanio++;
    }

    // DEQUEUE
    public String desencolar() {
        if (vacia()) {
            return "Cola vacía";
        } else {
            String aux = this.primero.valor;
            this.primero = this.primero.siguiente;
            this.tamanio--;

            return aux;
        }
    }

    public void imprimir() {
        if (vacia()) {
            System.out.println("Cola vacía");
        } else {
            Nodo aux = this.primero;

            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
