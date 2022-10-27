package Laboratorio.Clases;

import java.util.ArrayList;
import java.util.List;

public class Composicion {

	public static void main(String[] args) {
		Libro l1 = new Libro("Java 1", "Autor 1");
		Libro l2 = new Libro("Java 2", "Autor 2");
		Libro l3 = new Libro("Java 3", "Autor 3");

		List<Libro> libros = new ArrayList<Libro>();

		libros.add(l1);
		libros.add(l2);
		libros.add(l3);

		Libreria libreria = new Libreria(libros);

		List<Libro> todosLibros = libreria.getTodosLibrosLibreria();

		for (Libro libro: libreria.getTodosLibrosLibreria()) {
			System.out.println("Titulo: " + libro.titulo + " Autor: " + libro.autor);
		}
	}

}

class Libro {
	public String titulo;
	public String autor;

	Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
}

class Libreria {
	private final List<Libro> libros;

	Libreria(List<Libro> libros) {
		this.libros = libros;
	}

	public List<Libro> getTodosLibrosLibreria() {
		return libros;
	}
}