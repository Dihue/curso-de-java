package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

public class Pila {
    private Nodo ultimo;
    private int tamanio;

    public Pila() {
        this.ultimo = null;
        this.tamanio = 0;
    }

    public boolean vacio() {
        return this.ultimo == null;
    }

    // PUSH
    public void agregar(String valor) {
        Nodo nuevo = new Nodo(valor);

        if (vacio()) {
            this.ultimo = nuevo;
        } else {
            nuevo.siguiente = this.ultimo;
            this.ultimo = nuevo;
        }
        this.tamanio++;
    }

    // POP
    public String desapilar() {
        if (vacio()) {
            return "Pila vacía";
        } else {
            Nodo aux = new Nodo(this.ultimo.valor);

            this.ultimo = this.ultimo.siguiente;
            this.tamanio--;

            return aux.valor;
        }
    }

    public void imprimir() {
        if (vacio()) {
            System.out.println("Pila vacía");
        } else {
            Nodo aux = this.ultimo;

            for (int i = 0; i < this.tamanio; i++) {
                System.out.println(aux.valor);
                aux = aux.siguiente;
            }
        }
    }
}
