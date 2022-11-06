package Programacion.Cuatrimestre_02.Clases.C11_03;

public class Main {
    public static void main(String[] args) {

        String[] v = new String[] {"A"};

        Grafo grafo = new Grafo(v);

        grafo.conectar("A","B",12);
        grafo.conectar("A","D",5);
        grafo.conectar("B","A",30);
        grafo.conectar("C","A",15);
    }
}
