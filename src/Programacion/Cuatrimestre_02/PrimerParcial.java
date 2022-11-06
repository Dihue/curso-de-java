package Programacion.Cuatrimestre_02;
/*
Comentario:
Correcciones:

5   Principio de Ocultamiento => Correcto
10  Agregación => Correcto
15  Composición => Correcto
20  Construtores (por defecto y con parámetros) => Correcto
25  Herencia entre clases => Correcto
30  Polimorfismo => Correcto
35  Métodos de Clase => No se encontró un ejemplo.
40  Sobrecarga de métodos => No se encontró un ejemplo.. El ejemplo provisto es el de Sobreescritura.
45  Upcasting => Correcto
50  Downcasting => No se encontró un ejemplo. El downcasting implica casteo explicito, el cual no se encuentra.
55  Definir e Implementar una Interfaz => Correcto
 */
import java.util.ArrayList;
import java.util.List;

public class PrimerParcial {
    public static void main(String[] args) {
        // Instancias de clases
        Persona persona1 = new Persona();
        SuperHeroe ironMan = new SuperHeroe();
        Equipamiento equipamiento1 = new Equipamiento();

        // Polimorfismo
        persona1.setNombre("Tony Start");
        ironMan.setNombre("Iron Man");
        equipamiento1.setNombre("Avion Caza");

        // Upcasting
        //SuperHeroe hereoEjemplo = new Persona();

        // Downcasting
        Persona persona2 = new SuperHeroe();
        /*
        Downcasting => No se encontró un ejemplo. El downcasting implica casteo explicito,
        el cual no se encuentra.
         */
        Persona persona3 = new Persona();
        // Correccion?
        }
    }

    class Persona {
        // Principio de Ocultamiento
        private String nombre;
        private int edad;

        // Propiedades
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        // Metodo
        public String Saludo() {
            return "Hola soy " + nombre;
        }

        // Constructores
        // Por defecto
        public Persona() {
        }

        // Con parametros
        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Sobrecarga de Metodo
        // Override -> es sobreescritura del metodo
        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }


    class SuperHeroe extends Persona implements iDatos {
        // Principio de Ocultamiento
        private String habilidad;

        // Propiedad
        public String getHabilidad() {
            return habilidad;
        }

        public void setHabilidad(String habilidad) {
            this.habilidad = habilidad;
        }

        // Metodo
        public String Saludo() {
            return "Hola mi habilidad es " + habilidad;
        }

        // Constructor
        // Por defecto
        public SuperHeroe() {

        }

        // Con parametros
        public SuperHeroe(String nombre, int edad, String habilidad) {
            super(nombre, edad);
            this.habilidad = habilidad;
        }

        // Sobrecarga de Metodo
        // Override -> es sobreescritura del metodo
        @Override
        public String toString() {
            return "SuperHeroe{" +
                    "habilidad='" + habilidad + '\'' +
                    "} " + super.toString();
        }

        // Metodo implementado de la interface
        @Override
        public String datoHistorico() {
            return null;
        }
    }


    class Equipamiento {
        // Principio de ocultamiento
        private String nombre;

        // Propiedad
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Metodo
        public boolean Entendido() {
            return false;
        }

        // Constructores
        // Por defecto
        public Equipamiento() {

        }
        // Con parametros
        public Equipamiento(String nombre) {
            this.nombre = nombre;
        }
    }


    class Vengadores implements iDatos {
        // Agregacion
        private Equipamiento armas;

        // Composicion
        private List<SuperHeroe> listaHereos = new ArrayList<>();

        // Propiedades
        public Equipamiento getArmas() {
            return armas;
        }
        public void setArmas(Equipamiento armas) {
            this.armas = armas;
        }
        public List<SuperHeroe> getListaHereos() {
            return listaHereos;
        }
        public void setListaHereos(List<SuperHeroe> listaHereos) {
            this.listaHereos = listaHereos;
        }

        // Metodo
        public String Integrantes() {
            return "Integrantes " + listaHereos;
        }

        // Constructores
        // Por defecto
        public Vengadores() {

        }
        // Con parametros
        public Vengadores(List<SuperHeroe> listaHereos) {
            this.listaHereos = listaHereos;
        }

        @Override
        public String datoHistorico() {
            return null;
        }

    }


    interface iDatos {
        String datoHistorico();
    }
