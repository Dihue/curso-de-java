package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_NoLineales.Arboles;


public class ArbolBinario {
    private NodoABinario raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public boolean vacio() {
        return this.raiz == null;
    }

    public void construir(NodoABinario raiz) {
        this.raiz = raiz;
    }

    public void agregar(String valor) {
        this.raiz = agregarRecursivo(this.raiz, valor);
    }

    public void eliminar(String valor) {
        this.raiz = eliminarRecursivo(this.raiz, valor);
    }

    public void imprimirPreOrder() {
        preOrder(this.raiz);
    }

    public void imprimirInOrder() {
        inOrder(this.raiz);
    }

    public void imprimirPostOrder() {
        postOrder(this.raiz);
    }

    public void imprimirEnAnchura() {
        anchura(this.raiz);
    }


    // Método interno para agregar valores de forma recursiva
    private NodoABinario agregarRecursivo(NodoABinario nodo, String valor) {

        // Si el nodo es una hoja, entonces lo crea y retorna
        if (nodo == null) {
            nodo = new NodoABinario(valor);
            return nodo;
        }

        // En caso contrario, recorrer el árbol de forma recursiva
        if (valor.compareTo(nodo.valor) <= 0) {
            nodo.izquierda = agregarRecursivo(nodo.izquierda, valor);
        }
        else if (valor.compareTo(nodo.valor) > 0) {
            nodo.derecha = agregarRecursivo(nodo.derecha, valor);
        }

        // Retorna el nuevo nodo del árbol para ser unido a la raíz
        return nodo;
    }

    // Método interno para eliminar nodos tomando los 3 casos teóricos
    private NodoABinario eliminarRecursivo(NodoABinario nodo, String valor) {
        NodoABinario aux = nodo;

        if (aux == null) {
            return aux;
        }

        if (valor.compareTo(aux.valor) < 0) {
            aux.izquierda = eliminarRecursivo(aux.izquierda, valor);
        }
        else if (valor.compareTo(aux.valor) > 0) {
            aux.derecha = eliminarRecursivo(aux.derecha, valor);
        }
        else {
            if (aux.izquierda == null && aux.derecha == null) {
                aux = null;
            }
            else if (aux.derecha == null) {
                aux = aux.izquierda;
            } else if (aux.izquierda == null) {
                aux = aux.derecha;
            }
            else {
                NodoABinario auxNodoHojaIzquierda = encontrarNodoMasIzquierda(aux.derecha);
                aux.valor = auxNodoHojaIzquierda.valor;
                aux.derecha = eliminarRecursivo(aux.derecha, auxNodoHojaIzquierda.valor);
            }
        }
        return aux;
    }

    // Método auxiliar para el proceso de eliminación de nodos con sub-árboles a la izq y der
    private NodoABinario encontrarNodoMasIzquierda(NodoABinario nodo) {
        NodoABinario aux = nodo;

        while (aux.izquierda != null) {
            aux = aux.izquierda;
        }
        return aux;
    }

    // Método interno para realizar recorrido preOrder recursivo
    private void preOrder(NodoABinario nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.valor);
        preOrder(nodo.izquierda);
        preOrder(nodo.derecha);
    }

    // Método interno para realizar recorrido inOrder recursivo
    private void inOrder(NodoABinario nodo) {
        if (nodo == null) {
            return;
        }
        inOrder(nodo.izquierda);
        System.out.println(nodo.valor);
        inOrder(nodo.derecha);
    }

    // Método interno para realizar recorrido postOrder recursivo
    private void postOrder(NodoABinario nodo) {
        if (nodo == null) {
            return;
        }
        postOrder(nodo.izquierda);
        postOrder(nodo.derecha);
        System.out.println(nodo.valor);
    }

    // Método interno para realizar recorrido en anchura
    private void anchura(NodoABinario nodo) {

        ColaBusquedaAnchura cola = new ColaBusquedaAnchura();
        cola.encolar(nodo);

        while (!cola.vacia()) {
            NodoABinario aux = cola.desencolar();
            System.out.println(aux.valor + " ");

            // Enqueue hijo izquierdo
            if (aux.izquierda != null) {
                cola.encolar(aux.izquierda);
            }

            // Enqueue hijo derecho
            if (aux.derecha != null) {
                cola.encolar(aux.derecha);
            }
        }
    }

}
