package Programacion.Cuatrimestre_02.Ejemplos.Estructuras_Lineales;

public class Main {
    public static void main(String[] args) {

        ListaDoble listaDoble = new ListaDoble();
        listaDoble.agregar("1");
        listaDoble.agregar("2");
        listaDoble.agregarInicio("0");
        listaDoble.agregar("3");
        listaDoble.imprimir();
        System.out.println("\nLuego de eliminar el último");
        listaDoble.eliminarUltimo();
        System.out.println("\nInverso");
        listaDoble.imprimirInverso();

        /*ListaCircular listaCircular = new ListaCircular();
        listaCircular.agregar("1");
        listaCircular.agregar("2");
        listaCircular.agregar("3");
        listaCircular.imprimir();
        listaCircular.eliminarUltimo();
        System.out.println("\nLuego de eliminar el último");
        listaCircular.imprimir();*/

        /*ListaSimple listaSimple = new ListaSimple();
        listaSimple.agregar("1");
        listaSimple.agregar("2");
        listaSimple.agregar("3");
        listaSimple.agregar("4");
        listaSimple.imprimir();
        System.out.println("Todos los nodos");
        listaSimple.eliminarUltimo();
        System.out.println("\nLuego de eliminar el último");
        listaSimple.imprimir();*/
    }
}
