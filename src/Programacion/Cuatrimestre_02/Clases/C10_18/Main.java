package Programacion.Cuatrimestre_02.Clases.C10_18;

public class Main {

	public static void main(String[] args) {

		ListaSimple lista = new ListaSimple();
		lista.agregar("Hola");
		lista.agregar(" mundo");
		lista.imprimir();

		for (int i = 0; i < 10; i++) {
			lista.agregar("Valor " + i);
		}

		lista.imprimir();

		/*Nodo nodoA = new Nodo();
		nodoA.valor = "hola";

		Nodo nodoB = new Nodo();
		nodoB.valor = "mundo";

		Nodo nodoC = new Nodo();
		nodoC.valor = "!!";

		nodoA.siguiente = nodoB;
		nodoB.siguiente = nodoC;

		Nodo nodoA = new Nodo();

		nodoA.valor = "Hola";

		nodoA.siguiente = new Nodo();

		nodoA.siguiente.valor = "Mundo";

		nodoA.siguiente.siguiente = new Nodo();

		nodoA.siguiente.siguiente.valor = "!!";


		NodoA nodoA = new NodoA();

		nodoA.valor = "hola";

		nodoA.siguienteA = new NodoB();

		nodoA.siguienteA.valor = "mundo";

		nodoA.siguienteA.siguienteB = new NodoC();

		nodoA.siguienteA.siguienteB.valor = "!!";*/
	}

}
